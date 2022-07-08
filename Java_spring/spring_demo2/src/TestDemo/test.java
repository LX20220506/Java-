package TestDemo;

import com.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {


    /**
     * 对集合属性赋值：赋值类型为String
     */
    @Test
    public void TestStu1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Stu stu = (Stu) applicationContext.getBean("stu");

        System.out.println(stu.toString());
    }


    /**
     * 对集合属性赋值：赋值类型为引用类型
     */
    @Test
    public void TestStu2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config2.xml");
        Stu stu = (Stu) applicationContext.getBean("stu");
        stu.getCourseList().forEach(System.out::println);
    }

    /**
     * 测试FactoryBean
     * 注入对象A，返回对象B
     */

    @Test
    public void TestFactoryBean(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config3.xml");
//        MyBean myBean =(MyBean) applicationContext.getBean("myBean");
//        // 报错：java.lang.ClassCastException: com.entity.Course cannot be cast to com.entity.MyBean
//        // 无法将Course类型转换为MyBean类型
//        System.out.println(myBean);
        Course course =(Course) applicationContext.getBean("myBean");
        System.out.println(course);

    }

    /**
     * 测试作用域：当scope=singleton时
     */
    @Test
    public void TestScope1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config3.xml");
        User user1 = (User)applicationContext.getBean("user");
        User user2 = (User)applicationContext.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        //输出：指针相同
        //com.entity.User@3ce1e309
        //com.entity.User@3ce1e309
    }

    /**
     * 测试作用域：当scope=singleton时
     */
    @Test
    public void TestScope2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config3.xml");
        User user1 = (User)applicationContext.getBean("user");
        User user2 = (User)applicationContext.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        //输出：指针不同
        //com.entity.User@3ce1e309
        //com.entity.User@6aba2b86
    }


    /***
     * 测试bean的生命周期（未加后置处理器）
     *      添加生命周期后会有 7步
     */
    @Test
    public void TestBeanSMZQ1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config3.xml");
        Order order = (Order) applicationContext.getBean("order");
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(order);
        applicationContext.close();
    }





}
