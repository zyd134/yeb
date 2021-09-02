package com.zhang.server.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页公共返回对象
 */
@Api(value = "分页",tags = "分页")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {

    /**
     * 总条数
     */
    @ApiModelProperty(value = "总条数")
    private Long total;
    /**
     * 数据list
     */
    @ApiModelProperty(value = "数据List")
    private List<?> data;

}
