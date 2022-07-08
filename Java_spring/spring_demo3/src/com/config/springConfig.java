package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类，替代 xml 配置文件
@ComponentScan(basePackages = "com") // 指定要扫描的包
public class springConfig {
}
