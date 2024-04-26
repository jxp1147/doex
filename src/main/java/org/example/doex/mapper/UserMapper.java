package org.example.doex.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.doex.entity.vo.UserVO;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jxp
 * @since 2024-04-22
 */
@Repository
public interface UserMapper extends BaseMapper<UserVO> {
    UserVO getUserByUserName(String userName);
}
