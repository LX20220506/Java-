package com.aop.anno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) // 设置执行顺序
public class TestProxyOrder {

    @Before("execution(* com.aop.anno.User.* (..))")
    public void before(){
        System.out.println("TestProxyOrder before。。。。。。。");
    }

    @AfterReturning("execution(* com.aop.anno.User.* (..))")
    public void afterReturning(){
        System.out.println("TestProxyOrder  AfterReturning................");
    }
}
