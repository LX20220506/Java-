package com.ZhongZhi.controller;

import com.ZhongZhi.entity.DiKuai;
import com.ZhongZhi.entity.User;
import com.ZhongZhi.service.DiKuaiService;
import com.ZhongZhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DiKuaiController {

    @Autowired
    private DiKuaiService dikuaiService;

    @Autowired
    private UserService userService;

    @RequestMapping(value="/dk",method= RequestMethod.GET)
    public String showData(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        List<DiKuai> dkData = dikuaiService.getDiKuaiByRole(user);
        model.addAttribute("dks",dkData);
        System.out.println(dkData);
        return "dk";
    }

    /**
     * 跳转到添加地块页面
     */
    @RequestMapping(value = "/add",method= RequestMethod.GET)
    public String AddDK(Model model){
        List<User> allUser = userService.getAllUser();
        model.addAttribute("users",allUser);
        return "dkAddAndUpdate";
    }

    /**
     * 执行添加方法
     */
    @RequestMapping(value = "/AddAndUpdate",method = RequestMethod.POST)
    public  String AddDK(DiKuai dk){
        dikuaiService.addDiKuai(dk);
        return "redirect:/dk";
    }

    /**
     * 跳转到修改页面
     */
    @RequestMapping(value = "/update/{dkid}",method = RequestMethod.GET)
    public String UpdateDK(@PathVariable("dkid") int dkid,Model model){
        List<User> allUser = userService.getAllUser();
        model.addAttribute("users",allUser);
        DiKuai diKuai = dikuaiService.getDiKuaiById(dkid);
        model.addAttribute("dk",diKuai);
        return "dkAddAndUpdate";
    }

    /**
     * 执行修改方法
     */
    @RequestMapping(value = "/AddAndUpdate",method = RequestMethod.PUT)
    public  String updateDiKuai(DiKuai dk){
        dikuaiService.updateDiKuai(dk);
        return "redirect:/dk";
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteDK(@PathVariable("id") int id){
        dikuaiService.deleteDikuai(id);
        return "redirect:/dk";
    }

}
