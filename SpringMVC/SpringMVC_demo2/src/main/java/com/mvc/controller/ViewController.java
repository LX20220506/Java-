package com.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    /**
     * 测试重定向
     * @return
     */
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/success";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
