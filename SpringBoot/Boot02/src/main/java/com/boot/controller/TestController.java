package com.boot.controller;

import com.boot.entity.Account;
import com.boot.entity.User;
import com.boot.exception.UserInfoException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
public class TestController {

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session){

        if (!StringUtils.isEmpty(user.getUserName()) && user.getPassword().equals("123")){

            session.setAttribute("user",user);

            return "redirect:/index.html";
        }
        model.addAttribute("error","账号或密码错误");
        return "login";
    }

    @GetMapping("/index.html")
    public String index(){
        return "index";
    }



    /**
     * 跳转到form页面
     */
    @GetMapping("/form_layouts")
    public String formLayouts(){
        int s=10/0;

        return "form/form_layouts";
    }


    /**
     * 上传图片
     */
    @PostMapping("/form_layouts")
    public String update(@RequestParam("name") String name,
                         @RequestParam("password") String password,
                         @RequestPart("headimg") MultipartFile headimg,
                         @RequestPart("photos")MultipartFile[] photos){

        log.info("名称："+name);
        log.info("密码："+password);

        if (!headimg.isEmpty()){
            String filename = headimg.getOriginalFilename();
            try {
                headimg.transferTo(new File("C:\\Users\\1011751\\Desktop\\images\\"+filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (photos.length>0){
            for (MultipartFile photo : photos) {
                String filename = photo.getOriginalFilename();
                try {
                    photo.transferTo(new File("C:\\Users\\1011751\\Desktop\\images\\"+filename));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return "index";
    }


    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 测试druid
     */
    @ResponseBody
    @GetMapping("/count")
    public Long druidView(){
        Long count = jdbcTemplate.queryForObject("select count(*) from t_account", Long.class);
        return count;
    }
}
