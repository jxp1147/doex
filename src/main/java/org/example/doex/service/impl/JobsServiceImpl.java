package org.example.doex.service.impl;

import org.example.doex.entity.Jobs;
import org.example.doex.mapper.JobsMapper;
import org.example.doex.service.IJobsService;
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
public class JobsServiceImpl extends ServiceImpl<JobsMapper, Jobs> implements IJobsService {

}
