package MySqlConnection;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnection {

    // 从配置文件中读取配置,配置文件需要放到str文件下
    @Test
    public void TestConnection1() throws Exception {
        // 1.以流的方式，读取本地配置文件
        InputStream stream =ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");

        // 2.将流，转换成属性
        Properties properties = new Properties();
        properties.load(stream);

        // 3.拿到配置信息
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        // 4.获取MySQL的驱动
        Class.forName(driver);

        // 5.连接数据库
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }

    // 直接配置
    @Test
    public void TestConnection2() throws ClassNotFoundException, SQLException {

        // 1.连接字符串
        String conn= "jdbc:mysql://localhost:3306/JingDong?useSSL=false";

        // 2.设置数据库驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 3.连接数据库
        Connection connection = DriverManager.getConnection(conn, "root", "123456");

        System.out.println(connection);

    }

}
