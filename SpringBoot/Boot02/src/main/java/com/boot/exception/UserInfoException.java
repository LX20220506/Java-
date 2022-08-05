package com.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 自定义异常
 *      使用@ResponseStatus注解和RuntimeException
 *      通过@ResponseStatus可以设置默认的状态码，和默认的报错信息
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "用户信息有问题")
public class UserInfoException extends RuntimeException{

    public UserInfoException(){}

    public UserInfoException(String message){
        super(message); // 调用父类构造函数
    }

}
