package Thymeleaf.Fruit.servlet;

import Thymeleaf.Fruit.dao.FruitDao;
import Thymeleaf.Fruit.dao.impl.FruitDaoImpl;
import Thymeleaf.Fruit.pojo.Fruit;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



public class TestThymeleafServlet extends ViewBaseServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        FruitDaoImpl dao = new FruitDao();
//        List<Fruit> list = dao.getFruitList();
//
//        HttpSession session = req.getSession();
//        session.setAttribute("fruitlist",list);
//
//        super.processTemplate("show.html",req,resp);
        System.out.println("11");



    }
}
