package com.boot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute("user")==null){

            request.setAttribute("error","请先登录");
            // 若没有登录，转发到/，重新登录
            request.getRequestDispatcher("/").forward(request,response);

            return false;
        }

        return true;// 放行
    }
}
