package Thymeleaf.Fruit.JDBCUitls;

import org.junit.Test;

import java.sql.Connection;

public class DemoTest {
    @Test
    public void testConnection() {
        Connection connection = JDBCUtils.getConnection();
        System.out.println("connection = " + connection);
    }
}
