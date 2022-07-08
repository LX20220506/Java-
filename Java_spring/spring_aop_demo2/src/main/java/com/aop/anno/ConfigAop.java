package com.aop.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 设置为配置类
@ComponentScan(basePackages = "com.aop.anno") // 设置要扫描的包
@EnableAspectJAutoProxy(proxyTargetClass = true)  //开启 Aspect 生成代理对象
public class ConfigAop {
}
