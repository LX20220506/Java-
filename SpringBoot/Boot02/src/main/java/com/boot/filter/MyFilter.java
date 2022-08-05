package com.boot.filter;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = {"/js/*","/css/*","/my"}) // 注意：在spring boot中所有用‘**’表示；原生的所有用‘*’表示
public class MyFilter extends HttpFilter {

    @Override
    public void init() throws ServletException {
        log.info("初始化过滤器===");
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("执行filter");
        chain.doFilter(request,response); //放行
    }

    @Override
    public void destroy() {
        log.info("销毁过滤器");
    }
}
