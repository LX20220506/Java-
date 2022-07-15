package com.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class ScopeController {

    @RequestMapping("/ServletAPI")
    public String request(HttpServletRequest request){
        request.setAttribute("testScope","这是request");
        return "success";
    }

    /**
     * 推荐使用这种方式
     *      其他方式也是封装成 ModelAndView对象
     * @return
     */
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("testScope","这是ModelAndView");
        mv.setViewName("success");// 设置要跳转的页面
        return mv;
    }

    @RequestMapping("/model")
    public String modle(Model model){
        model.addAttribute("testScope","modle");
        return "success";
    }

    @RequestMapping("/map")
    public String map(Map<String,Object> map){
        map.put("testScope","map");
        return "success";
    }

    @RequestMapping("/modelMap")
    public String modelMap(ModelMap modelMap){
        modelMap.addAttribute("testScope","modelMap");
        return "success";
    }

}
