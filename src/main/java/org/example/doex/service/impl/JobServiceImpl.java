package org.example.doex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.doex.entity.vo.JobVO;
import org.example.doex.mapper.JobMapper;
import org.example.doex.service.IJobService;

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
public class JobServiceImpl extends ServiceImpl<JobMapper, JobVO> implements IJobService {

}
