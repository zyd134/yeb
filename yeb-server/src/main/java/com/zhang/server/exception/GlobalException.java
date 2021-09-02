package com.zhang.server.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * @author thinkpad
 */
@RestControllerAdvice
public class GlobalException {

    /*@ExceptionHandler(Exception.class)
    public RespBean exception(Exception e){
        return RespBean.error("系统出现异常，请联系管理员！");
    }*/


}
