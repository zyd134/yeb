package com.zhang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.MenuMapper;
import com.zhang.pojo.Admin;
import com.zhang.pojo.Menu;
import com.zhang.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zyd
 * @since 2021-08-27
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 通过用户id查询菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusByAdminId(Integer adminId) {
        return menuMapper.getMenusByAdminId(adminId);
    }

    /**
     * 根据角色获取菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusWithRole() {
        return menuMapper.getMenusWithRole();
    }

    /**
     * 查询所有菜单
     * @return
     */
    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

}
