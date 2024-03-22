package com.it117.spring_boot_tlias.exception;

import com.it117.spring_boot_tlias.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理器
 */

@SuppressWarnings("ALL")
@RestControllerAdvice
//@RestControllerAdvice = @ControllerAdvice + @ResponseBody
//@ResponseBody 会将方法的返回值转换为json
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
//    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    //指明我们需要捕获哪些异常
    public Result ex(Exception ex){
        ex.printStackTrace();
        return Result.error("对不起,操作失败,请联系管理员!");
    }
}
