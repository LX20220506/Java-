package Fruit.servlet;


import Fruit.dao.FruitDao;
import Fruit.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/test")
public class IndexServlet extends ViewBaseServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FruitDao fruitDao = new FruitDao();
        List<Fruit> fruitList = fruitDao.getFruitList();
        System.out.println(fruitList);
        // 设置请求回话，将数据传到前端
        request.setAttribute("data",fruitList);
        // 要通过父类的方法进行页面跳转，才能使用thymeleaf组件，展示数据
        super.processTemplate("index", request, response);
    }
}
