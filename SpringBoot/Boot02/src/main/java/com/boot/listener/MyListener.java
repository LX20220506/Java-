package com.boot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("创建监听器。。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("监听器销毁。。。。。");
    }
}
