package org.example.doex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.doex.entity.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
public interface IUserService extends IService<UserVO> {
    UserVO login(String username, String password);
    String generateJwtToken(UserVO user);
}
