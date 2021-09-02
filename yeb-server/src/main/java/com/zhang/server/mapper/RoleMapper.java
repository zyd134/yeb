package com.zhang.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.server.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zyd
 * @since 2021-08-27
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
