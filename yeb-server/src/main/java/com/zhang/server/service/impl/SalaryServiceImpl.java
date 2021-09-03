package com.zhang.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zhang.server.mapper.SalaryMapper;
import com.zhang.server.pojo.Salary;
import com.zhang.server.service.ISalaryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zyd
 * @since 2021-09-03
 */
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
