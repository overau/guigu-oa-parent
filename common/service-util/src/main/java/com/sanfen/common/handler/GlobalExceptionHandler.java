package com.sanfen.common.handler;

import com.sanfen.common.execption.GuiguException;
import com.sanfen.common.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 * @author HeJin
 * @version 1.0
 * @since 2023/03/16 23:39
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result<?> error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(GuiguException.class)
    public Result<?> error(GuiguException e){
        e.printStackTrace();
        return Result.fail().message(e.getMessage()).code(e.getCode());
    }

}
