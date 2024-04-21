package org.example.doex.service.impl;

import org.example.doex.entity.Users;
import org.example.doex.mapper.UsersMapper;
import org.example.doex.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
