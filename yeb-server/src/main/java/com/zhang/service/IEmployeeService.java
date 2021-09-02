package com.zhang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhang.pojo.Employee;
import com.zhang.pojo.RespBean;
import com.zhang.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zyd
 * @since 2021-08-31
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取所有员工（分页）
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);
}
