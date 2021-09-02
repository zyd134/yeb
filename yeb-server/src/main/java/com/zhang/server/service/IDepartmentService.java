package com.zhang.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhang.server.pojo.Department;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zyd
 * @since 2021-08-31
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();
}
