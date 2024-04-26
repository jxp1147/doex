package org.example.doex.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.example.doex.entity.vo.UserVO;
import org.example.doex.mapper.UserMapper;
import org.example.doex.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserVO> implements IUserService {
    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration.minutes}")
    private int jwtExpirationMinutes;
    private UserMapper userMapper;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public String generateJwtToken(UserVO user) {
        // 设置JWT令牌的有效载荷（claims）
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", user.getId());
        claims.put("username", user.getUserName());
        // 可以添加更多自定义claims，如角色、权限等

        // 设置过期时间
        Date expirationDate = new Date(System.currentTimeMillis() + jwtExpirationMinutes * 60 * 1000L);

        // 构建并返回JWT令牌
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(user.getUserName()) // 主题（subject），可选
                .setIssuedAt(new Date()) // 签发时间（issued at）
                .setExpiration(expirationDate) // 过期时间（expiration）
                .signWith(SignatureAlgorithm.HS256, jwtSecret) // 使用HS256算法和密钥签名
                .compact();
    }
    @Override
    public UserVO login(String userName, String password) {
        // 从数据库查询用户
        UserVO user = userMapper.getUserByUserName(userName);

        // 用户不存在或密码不匹配，返回null
        if (user == null || !passwordEncoder.matches(password, user.getPassword())) {
            return null;
        }

        // 用户存在且密码匹配，返回用户对象
        return user;
    }
}
