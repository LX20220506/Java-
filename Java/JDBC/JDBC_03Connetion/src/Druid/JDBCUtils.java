package Druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {


    public static   DataSource  dataSource;
    {
        try {
            InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");

            Properties prop = new Properties();
            prop.load(stream);

            dataSource= new DruidDataSourceFactory().createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void getConnection() throws SQLException {

        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);

        //PreparedStatement接口
        String sql2 = "DELETE FROM t_fruit where fid = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql2);
        preparedStatement.setInt(1,50);
        boolean execute = preparedStatement.execute();
        System.out.println(execute);
        //关闭连接
        conn.close();



//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setInitialSize(10);// 初始连接数量
//        druidDataSource.setMaxActive(10);// 最大连接数是8个
//        druidDataSource.setPassword("");
//        druidDataSource.setUrl("");
//        druidDataSource.setUsername();
//        druidDataSource.setDriverClassName();
    }

    @Test
    public void Test() throws SQLException {
        //数据源配置
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/fruitdb?useSSL=false");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); //这个可以缺省的，会根据url自动识别
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        //下面都是可选的配置
        dataSource.setInitialSize(10);  //初始连接数，默认0
        dataSource.setMaxActive(30);  //最大连接数，默认8
        dataSource.setMinIdle(10);  //最小闲置数
        dataSource.setMaxWait(2000);  //获取连接的最大等待时间，单位毫秒
        dataSource.setPoolPreparedStatements(true); //缓存PreparedStatement，默认false
        dataSource.setMaxOpenPreparedStatements(20); //缓存PreparedStatement的最大数量，默认-1（不缓存）。大于0时会自动开启缓存PreparedStatement，所以可以省略上一句代码

        //获取连接
        Connection connection = dataSource.getConnection();

        //Statement接口
//        Statement statement = connection.createStatement();
//        String sql1 = "insert into tb_student (name,age) values ('chy',20)";
//        statement.executeUpdate(sql1);

        //PreparedStatement接口
        String sql2 = "delete t_fruit where fid>?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql2);
        preparedStatement.setInt(1,50);
        boolean execute = preparedStatement.execute();
        System.out.println(execute);
        //关闭连接
        connection.close();


    }
}
