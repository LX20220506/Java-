package com.boot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalException {
    /**
     * 通过@ExceptionHandler 注解，来指定要捕获的异常；
     * 当发生该异常时，会执行该方法
     * @param e 捕捉的错误信息
     * @return  返回类型为ModelAndView；报错后返回指定页面
     */
    @ExceptionHandler({ArithmeticException.class})
    public String handleAritException(Exception e){
        log.error("错误异常是："+e);
        return "5xx";  // 要条转的页面

    }
}
