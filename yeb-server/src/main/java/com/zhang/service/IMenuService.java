package com.zhang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhang.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zyd
 * @since 2021-08-27
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 通过用户id查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId(Integer adminId);

    /**
     * 根据角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();

}
