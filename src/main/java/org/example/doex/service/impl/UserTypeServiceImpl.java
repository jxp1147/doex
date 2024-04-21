package org.example.doex.service.impl;

import org.example.doex.entity.UserType;
import org.example.doex.mapper.UserTypeMapper;
import org.example.doex.service.IUserTypeService;
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
public class UserTypeServiceImpl extends ServiceImpl<UserTypeMapper, UserType> implements IUserTypeService {

}
