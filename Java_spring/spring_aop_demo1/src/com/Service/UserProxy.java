package com.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

//创建代理对象代码
public class UserProxy implements InvocationHandler {

    // 需要代理的对象（就是需要添加扩展的对象）
    private Object obj;

    // 将需要进行代理的对象传进来
    public UserProxy(Object obj){
        this.obj=obj;
    }


    /**
     * AOP动态代理的实现方法：
     *      通过实现InvocationHandler接口 的invoke方法 来实现Aop功能
     * @param proxy
     * @param method    执行的方法
     * @param args      执行方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行方法前
        System.out.println("执行方法前：方法名称-"+method.getName()+";传入的参数："+ Arrays.toString(args));

        // 执行方法
        Object result = method.invoke(obj,args);// 执行方法需要指定 对象，和方法参数
        System.out.println("执行方法完成。。。。。。。。");

        //执行方法后
        System.out.println("执行方法后：执行方法的对象-"+obj);

        // 返回方法执行的结果（可以进行加工）
        return result;
    }
}
