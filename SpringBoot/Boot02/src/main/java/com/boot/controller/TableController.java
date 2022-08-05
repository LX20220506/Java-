package com.boot.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.entity.Account;
import com.boot.entity.User;
import com.boot.exception.UserInfoException;
import com.boot.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class TableController {

    @Autowired
    AccountService accountService;

    @GetMapping("/basic_table")
    public String basicTable(){
        throw new UserInfoException();
        //return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamicTable(@RequestParam(value = "page",defaultValue = "1") Integer index, Model model){

        // List<User> users= Arrays.asList(
        //         new User("tom","123"),
        //         new User("jie","456"),
        //         new User("hil","78*"),
        //         new User("chen","as")
        // );
        // model.addAttribute("users",users);

        // List<Account> allAccount = accountService.getAllAccount();
        //
        // model.addAttribute("accounts",allAccount);

        Page<Account> page = accountService.getPage(index, 2);

        model.addAttribute("page",page);

        log.info(String.valueOf(page.getTotal()));// 数据总条数
        //log.info(String.valueOf(page.getCountId()));
        log.info(String.valueOf(page.getCurrent()));// 当前页数
        log.info(String.valueOf(page.getSize()));
        log.info(String.valueOf(page.getPages()));// 总页数
        log.info(String.valueOf(page.getOrders()));

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsiveTable(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editableTable(){
        return "table/editable_table";
    }

    @GetMapping("/boxed_view")
    public String boxedView(){
        return "table/boxed_view";
    }

    @GetMapping("/blank_page")
    public String blankPage(){
        return "table/blank_page";
    }

}
