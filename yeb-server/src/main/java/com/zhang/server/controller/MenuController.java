package com.zhang.server.controller;

import com.zhang.server.utils.AdminUtils;
import com.zhang.server.pojo.Menu;
import com.zhang.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 目录
 * @author thinkpad
 */
@RestController
@RequestMapping("/system/cfg")
public class MenuController {

    @Autowired
    private IMenuService menuService;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByAdminId(){
        Integer adminId = AdminUtils.getCurrentAdmin().getId();
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        //从redis获取菜单数据
        List<Menu> menus = (List<Menu>)valueOperations.get("menu_" + adminId);
        //如果为空，去数据库获取
        if (CollectionUtils.isEmpty(menus)){
            //根据主键获取目录信息
            menus = menuService.getMenusByAdminId(adminId);
            //将手机设置到redis中
            valueOperations.set("menu_" + adminId, menus);
        }
        return menus;
    }


}
