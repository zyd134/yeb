package com.zhang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.EmployeeMapper;
import com.zhang.pojo.Employee;
import com.zhang.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zyd
 * @since 2021-08-04
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
