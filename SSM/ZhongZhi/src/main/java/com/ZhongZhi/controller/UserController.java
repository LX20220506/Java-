package com.ZhongZhi.controller;

import com.ZhongZhi.entity.User;
import com.ZhongZhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String getIndex(User login, Model model, HttpSession session){
        User user = userService.getLogin(login);
        if (user==null){
            model.addAttribute("err","密码或账号错误");
            return "Login";
        }
        session.setAttribute("user",user);
        return "index";
    }
}
