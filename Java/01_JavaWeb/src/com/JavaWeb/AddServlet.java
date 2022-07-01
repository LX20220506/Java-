package com.JavaWeb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置编码 Tomcat8 post方式传入中文时，需要设置编码格式
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        String priceStr = request.getParameter("price");
        Double price = Double.parseDouble(priceStr);
        String fcountStr = request.getParameter("fcount");
        Integer fcount = Integer.parseInt(fcountStr);

        System.out.println("name:"+name+"\nprice:"+priceStr+"\nfcount:"+fcount);
    }
}
