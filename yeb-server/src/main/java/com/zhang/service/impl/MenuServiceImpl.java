package com.zhang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.MenuMapper;
import com.zhang.pojo.Menu;
import com.zhang.service.IMenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
