package com.zhang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.PositionMapper;
import com.zhang.pojo.Position;
import com.zhang.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
