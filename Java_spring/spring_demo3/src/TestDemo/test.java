package TestDemo;


import com.servlet.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

    /**
     * 测试使用xml配置ioc
     */
    @Test
    public void Test1(){
        // 加载配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        UserService userServlet = (UserService) applicationContext.getBean("userService");
        userServlet.add();
    }

    /**
     * 测试使用完全注解配置ioc
     *      注意：获取配置的方式改变了
     */
    @Test
    public void Test2(){
        // 加载配置类
        AnnotationConfigApplicationContext com = new AnnotationConfigApplicationContext("com");
        UserService userService = (UserService) com.getBean("userService");
        userService.add();
    }
}
