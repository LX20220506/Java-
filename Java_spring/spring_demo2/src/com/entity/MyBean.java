package com.entity;

import org.springframework.beans.factory.FactoryBean;


/**
 * 让Mybean实现FactoryBean接口；
 * 当注入MyBean对象时，会返回泛型的对象
 */
public class MyBean implements FactoryBean<Course> {

    // 返回Course对象（返回泛型对象）
    @Override
    public Course getObject() throws Exception {
        return new Course();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

}
