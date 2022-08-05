package com.SpringBoot.controller;

import com.SpringBoot.ebtity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world，你好";
    }


    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }

}
