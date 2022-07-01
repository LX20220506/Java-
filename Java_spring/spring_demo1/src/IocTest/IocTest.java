package IocTest;

import BookDemo.Book;
import UserDemo.Servlet.UserServlet;
import demo.Calculation;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class IocTest {

    /**
     * 测试依赖注入的流程
     */
    @Test
    public void Test(){
        // 通过读取类路径下的 XML 格式的配置文件；创建 IOC 容器对象（最好是提到外面去，定义为私有的全局变量）
        ApplicationContext application= new ClassPathXmlApplicationContext("application.xml");

        // 通过读取配置文件中id为Calculation的标签，拿到他的class属性，
        // 通过反射创建object类型，再使用类型强转，转换为需要的类型
        Calculation calculation =(Calculation) application.getBean("Calculation");

        // 调用类中的方法
        calculation.Add();

    }

    /**
     * 测试ioc：有参构造函数的注入初始参数
     */
    @Test
    public void TestBook1(){
        // 1.读取配置，创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        // 2.创建对象
        Book book = (Book) applicationContext.getBean("book");

        //3.调用方法
        System.out.println(book.toString());//输出：Book{name='九阳神功'}
    }

    /**
     * 测试ioc：测试Book的set注入
     */
    @Test
    public void TestBook2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config2.xml");
        Book book =(Book) applicationContext.getBean("book");
        System.out.println(book.toString());
    }


    /**
     * 测试ioc：测试UserDemo；在UserServlet中，使用构造函数注入 引用类型（UserDao）
     */
    @Test
    public void TestUser1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config3.xml");
        UserServlet userServlet = (UserServlet)applicationContext.getBean("UserServlet");
        userServlet.Add();
    }


    /**
     * 测试ioc：测试UserDemo；在UserServlet中，使用构造函数注入 引用类型（UserDao）
     */
    @Test
    public void TestUser2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config4.xml");
        UserServlet userServlet = (UserServlet)applicationContext.getBean("UserServlet");

        userServlet.Add();
    }


}
