import com.Dao.UserDao;
import com.Dao.UserDaoImpl;
import com.Service.UserService;
import com.config.configTransaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    // 配置和注解混合
    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService=applicationContext.getBean("userService",UserService.class);
        userService.accountMoney();
    }


    // 完全配置
    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService=applicationContext.getBean("userService",UserService.class);
        userService.accountMoney();
    }

    // 完全注解
    @org.junit.Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configTransaction.class);
        UserService userService=context.getBean("userService",UserService.class);
        userService.accountMoney();
    }
}
