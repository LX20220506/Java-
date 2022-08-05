package com.SpringBoot.config;

import com.SpringBoot.ebtity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration(proxyBeanMethods = true)// proxyBeanMethods:设置代理bean的方式是否为单例
public class MyConfig {


}
