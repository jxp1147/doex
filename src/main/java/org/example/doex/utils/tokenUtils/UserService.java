package org.example.doex.utils.tokenUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.util.Date;

@Service
public class UserService {

    @Value("${jwt.secret}")
    private String jwtSecret;

    /**
     * 判断用户是否已登录。
     *
     * @param request HTTP请求对象，用于获取请求头中的JWT令牌。
     * @return true表示已登录，false表示未登录。
     */
    public boolean isUserLoggedIn(HttpServletRequest request) {
        String authorizationHeader = request.getHeader("Authorization");
        if (StringUtils.isEmpty(authorizationHeader) || !authorizationHeader.startsWith("Bearer ")) {
            return false;
        }

        String token = authorizationHeader.substring("Bearer ".length());
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtSecret)
                    .parseClaimsJws(token)
                    .getBody();

            // 验证JWT令牌是否过期
            Date expiration = claims.getExpiration();
            Instant now = Instant.now();
            return now.isBefore(expiration.toInstant());
        } catch (Exception e) {
            // 解析或验证JWT令牌失败，视为未登录
            return false;
        }
    }
}