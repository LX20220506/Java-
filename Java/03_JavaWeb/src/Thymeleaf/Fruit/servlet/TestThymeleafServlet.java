package Thymeleaf.Fruit.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
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
