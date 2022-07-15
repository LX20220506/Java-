package com.rset.mvc.controller;

import com.rset.mvc.dao.Employee;
import com.rset.mvc.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired  // 属性注入
    private EmployeeDao employeeDao;


    /**
     * 展示数据
     * @param model
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList",employeeList);
        return "list";
    }

    /**
     * 删除数据
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        employeeDao.delete(id);
        return "redirect:/list";
    }

    /**
     * 跳转到添加数据页面
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String toAdd(){
        return "add";
    }

    /**
     * 执行添加操作
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String toAdd(Employee employee){
        employeeDao.save(employee);
        return "redirect:/list";
    }

    /**
     * 跳转到修改页面
     */
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String update(@PathVariable Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        return "update";
    }

    /**
     * 修改操作
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String update(Employee employee){
        employeeDao.save(employee);
        return "redirect:/list";
    }


}
