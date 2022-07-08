package com.aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component // 注入
@Aspect // 设置为代理对象
@Order(2) // 设置执行顺序
public class UserProxy {

    @Pointcut("execution(* com.aop.anno.User.* (..))")
    public void pointdemo(){

    }

    @Before("pointdemo()")
    public void before(){
        System.out.println("Before。。。。。。。。。");
    }

    @After("pointdemo()")
    public void after() {
        System.out.println("After........");
    }

    @AfterReturning("pointdemo()")
    public void afterReturning(){
        System.out.println("AfterReturning................");
    }

    @AfterThrowing("pointdemo()")
    public void afterThrowing(){
        System.out.println("AfterThrowing.............");
    }

    @Around("pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around  环绕之前。。。。。。。。。。。。。。");
        proceedingJoinPoint.proceed();
        System.out.println("around  环绕之后。。。。。。。。。。。。。。");
    }
}
