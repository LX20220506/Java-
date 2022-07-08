package com.servlet;

import com.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//在注解里面 value 属性值可以省略不写，
//默认值是类名称，首字母小写
//UserService -- userService
@Component(value = "userService") //注解等同于XML配置文件：<bean id="userService" class=".."/>
public class UserService {

//    /**
//     * 使用@Autowired注解，可以通过注入属性
//     *      注意：这种方式是通过类型注入的；当UserDAO接口有多个实现类时，他就不知道注入的是哪个变量了
//     */
//    @Autowired
//    /**
//     * 使用@Qualifier注解，可以名称注入属性
//     *      注意：@Qualifier 要和@Autowired注解 一起使用
//     */
//    @Qualifier(value = "userDaoImpl")
    @Resource(name = "userDaoImpl") //可以根据类型注入，也可以根据名称注入（它属于javax包下的注解，不推荐使用！）
    private UserDAO userDAO;

    public void add(){
        System.out.println("UserServlet add .............");
        userDAO.add();
    }
}
