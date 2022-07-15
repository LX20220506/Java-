package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RSETfulController {

    @RequestMapping(value = "/testRSETful",method = RequestMethod.GET)
    public String testRSETful(){
        return "RSETful";
    }

    @RequestMapping(value = "/testRSETful",method = RequestMethod.PUT)
    public String testRSETful(String name,String pwd){

        System.out.println("账号："+name+"_密码："+pwd);

        return "success";
    }

}
