package com.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.entity.Emp;
import com.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    // 查询所有数据
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getShowList(Model model){
        model.addAttribute("emps",empService.getAllEmp());
        return "list";
    }

    // 根据姓名搜索
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String getShowListByName(@RequestParam("name") String name,Model model){
        model.addAttribute("emps",empService.getAllEmpByName(name));
        model.addAttribute("name",name);
        return "list";
    }

    // 跳转到添加页面
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String getAdd(Model model){
        model.addAttribute("title","添加");
        model.addAttribute("action","/add");
        return "AddAndUpdate";
    }

    /**
     * 添加员工
     * @param emp 前端传入要添加的数据
     * @param photo 上传的图片
     * @param httpSession
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String getAdd(Emp emp, MultipartFile photo,  HttpSession httpSession) throws IOException {

        // 获取文件的名称
        String filename = photo.getOriginalFilename();
        // 截取文件的后缀
        String hzName = filename.substring(filename.lastIndexOf("."));
        // 创建一个获取时间的对象
        LocalDateTime dateTime = LocalDateTime.now();
        // 拼接文件名称：员工名称+年月日+时分秒+后缀
        filename = emp.getEmpName()
                +dateTime.getYear()
                +dateTime.getMonth()
                +dateTime.getDayOfMonth()
                +dateTime.getHour()
                +dateTime.getMinute()
                +dateTime.getSecond()
                + hzName;
        // 创建ServletContext（application）
        ServletContext servletContext = httpSession.getServletContext();
        // 获取指定路径
        String img = servletContext.getRealPath("img");
        // 根据指定指定路径创建File
        File file = new File(img);
        if (!file.exists()){// 判断是否存在该路径
            file.mkdir();   // 不存在，则创建
        }
        // 拼接完整路径
        String filePath = img + File.separator + filename;
        // 实现上传功能
        photo.transferTo(new File(filePath));
        // 设置文件的名称
        emp.setImg(filename);
        // 添加员工
        empService.addEmp(emp);
        return "redirect:/list";
    }

    // 跳转到修改页面
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String getUpdate(@PathVariable("id") int id, Model model){
        Emp emp = empService.getEmpById(id);
        model.addAttribute("emp",emp);
        model.addAttribute("title","修改");
        model.addAttribute("action","/update");
        return "AddAndUpdate";
    }

    @RequestMapping(value = "/update")
    public String getUpdate(Emp emp,String _method,MultipartFile photo,HttpSession httpSession) throws IOException {

        if (photo!=null){
            // 获取图片名称
            String filename = photo.getOriginalFilename();
            // 获取后缀
            String hzName = filename.substring(filename.lastIndexOf("."));
            // 获取根目录的文件夹
            ServletContext servletContext = httpSession.getServletContext();
            String img = servletContext.getRealPath("img");
            // 根据根目录文件夹创建File对象
            File file = new File(img);
            if (!file.exists()){ // 判断是否存在文件夹
                file.mkdir();   // 创建文件夹
            }
            // 拼接文件名
            LocalDateTime now = LocalDateTime.now();
            filename =  emp.getEmpName() +
                    now.getYear() +
                    now.getMonth() +
                    now.getDayOfMonth() +
                    now.getHour() +
                    now.getMinute() +
                    now.getSecond() +
                    hzName;
            // 拼接完整路径
            String filepath=img + File.separator +filename;
            // 文件上传
            photo.transferTo(new File(filepath));

            emp.setImg(filename);
        }

        empService.getUpdateEmp(emp);

        return "redirect:/list";
    }

    // 删除
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String getDeleteById(@PathVariable("id") int id){
        empService.getDeleteById(id);
        return "redirect:/list";
    }

    // 响应分页数据
    @RequestMapping(value = "/list/{index}/{size}")
    @ResponseBody
    public PageInfo<Emp> getPageInfo(@PathVariable("index") int index,@PathVariable("size") int size){
        PageInfo<Emp> allEmpByPage = empService.getAllEmpByPage(index, size);
        return allEmpByPage;
    }






}
