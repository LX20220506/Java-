package com.mvc.controller;


import com.mvc.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/demo1")
    public String demo1(int id){
        System.out.println(id);
        return "demo1";
    }

    @RequestMapping("/demo2/{id}")
    public String demo2(@PathVariable("id") int id){
        System.out.println(id);
        return "demo1";
    }

    @RequestMapping(value = "/demo3",method ={RequestMethod.POST})
    public String demo3(Users user){

        System.out.println(user.toString());
        return "demo1";
    }
}
