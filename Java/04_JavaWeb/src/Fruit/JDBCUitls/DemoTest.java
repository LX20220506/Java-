package Fruit.JDBCUitls;

import org.junit.Test;

import java.sql.Connection;

public class DemoTest {
    @Test
    public void testConnection() {
        Connection connection = JDBCUtil.getConnection();
        System.out.println("connection = " + connection);
    }
}
