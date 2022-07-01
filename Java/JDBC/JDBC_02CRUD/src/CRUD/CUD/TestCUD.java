package CRUD.CUD;

import JDBCUtils.JDBCUitls;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 测试增删改
 */
public class TestCUD {

    /**
     * 测试添加方法
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void TestFruit1() throws ClassNotFoundException, SQLException {
        // 1.创建数据库连接对象
        String connStr="jdbc:mysql://127.0.0.1:3306/fruitdb?useSSL=false";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(connStr, "root", "123456");

        // 2.预编译sql语句
        String sql="INSERT t_fruit(fname,price,fcount,remark) VALUE(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        // 3.填充占位符
        ps.setString(1,"2");
        ps.setInt(2,2);
        ps.setInt(3,2);
        ps.setString(4,"2");

        // 4.执行操作
        ps.execute();

        // 5.关闭连接
        ps.close();
        conn.close();
    }

    /**
     * 使用JDBCUitls类创建数据库上下文对象，测试删除方法
     * @throws SQLException
     */
    @Test
    public void TestFruit2() throws SQLException {
        // 1.创建连接对象
        Connection connection = JDBCUitls.getConnection();
//        System.out.println(connection);
        // 2.执行预编译sql语句
        String sql="delete from t_fruit where fid = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        // 3.填充参数
        ps.setInt(1,35);
        // 4.执行操作
        boolean execute = ps.execute();
//        System.out.println(execute);  false表示没有错误，添加成功；true表示存在错误，添加失败
        // 5.释放资源
        JDBCUitls.closeResource(connection,ps);
    }


    /**
     * 公共的增删改操作方法
      * @param sql
     * @param args
     */
    public void Update(String sql,Object ...args)  {
        Connection connection=null;
        PreparedStatement ps=null;
        try {
            // 1.创建数据库连接对象
            connection = JDBCUitls.getConnection();
            // 2.执行预编译sql语句
            ps = connection.prepareStatement(sql);
            // 3.填充参数
            for (int i = 0; i < args.length; i++){
                ps.setObject(i+1,args[i]);
            }
            // 4.执行操作
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 5.释放资源
            JDBCUitls.closeResource(connection,ps);
        }

    }


    /**
     * 使用公共的增删改方法，执行修改操作
     */
    @Test
    public void TestUpdate(){
        String sql="update t_fruit set fname = ?,price=?,remark=? where fid=?";
        Update(sql,"3",3,"3",36);
    }
}
