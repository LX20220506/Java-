package com.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/demo1")
    public String getDemo1(){
        return "demo1";
    }
}
