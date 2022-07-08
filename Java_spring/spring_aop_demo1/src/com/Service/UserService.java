package com.Service;

import com.ado.UserDAO;
import com.ado.UserDaoImpl;

import java.lang.reflect.Proxy;

public class UserService {
    public static void main(String[] args) {
        // 1.定义需要进行扩展的对象
        UserDaoImpl dao = new UserDaoImpl();
        // 2.定义这个需要扩展类型所实现的接口（一个类可以实现多个接口，所以这里是数组）
        Class[] interfaces={UserDAO.class};

        /**
         * 3.创建扩展后的对象
         *      通过 Proxy对象的 newProxyInstance方法创建动态代理； newProxyInstance方法有三个参数
         *          1）类的构造器
         *          2）需要代理的类的实现接口
         *          3）实现InvocationHandler接口的对象
         *      返回结果是Object类型，需要强转
         */
        UserDAO userDao
                = (UserDAO)Proxy.newProxyInstance(UserService.class.getClassLoader(), interfaces, new UserProxy(dao));

        userDao.add(1,2);
    }
}

