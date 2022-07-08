package com.aop.anno;

import org.springframework.stereotype.Component;

@Component
public class UserProxy {

    public void before(){
        System.out.println("执行了 before方法");
    }
}
