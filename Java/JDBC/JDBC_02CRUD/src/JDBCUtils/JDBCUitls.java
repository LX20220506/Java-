package JDBCUtils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUitls {
    /**
     * 创建一个数据库连接对象
     * @return
     */
    public static Connection getConnection() {
        Connection conn=null;
        try {
            String connStr="jdbc:mysql://127.0.0.1:3306/fruitdb?useSSL=false";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(connStr, "root", "123456");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }


    /**
     * 释放资源
     * @param conn
     * @param ps
     */
    public static void closeResource(Connection conn, PreparedStatement ps){
        try {
            ps.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 释放资源
     * @param conn
     * @param ps
     */
    public static void closeResource(Connection conn, PreparedStatement ps, ResultSet rs){
        try {
            rs.close();
            ps.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }



    /**
     * 返回单条数据的通用查询
     * @param connection 从外部传入数据库连接对象，方便执行事务
     * @param clazz
     * @param sql 当数据库表列名与实体对象属性名称不一致时，要给数据库表列名自定义列名，从而和实体属性值对应
     * @param args
     * @param <T>
     * @return
     */
    public <T> T Query(Connection connection,Class<T> clazz ,String sql,Object ...args) {
        PreparedStatement ps =null;
        ResultSet resultSet =null;
        try {
            ps = connection.prepareStatement(sql);

            for (int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }

            // 拿到数据集
            resultSet = ps.executeQuery();
            // 拿到数据集元数据（ResultSet）
            ResultSetMetaData rsmd = resultSet.getMetaData();
            // 获取表字段的总数据
            int columnCount = rsmd.getColumnCount();

            // 判断是否存在数据
            if (resultSet.next()){
                // 通过类型，反射创建对象
                T t = clazz.newInstance();

                // 通过循环查询数据的字段数，来为对象赋值
                for (int i=0; i<columnCount;i++){
                    // 获取每个列的值
                    Object value = resultSet.getObject(i + 1);

                    // 获取每列的的名称
                    String columnLabel = rsmd.getColumnLabel(i + 1);

                    // 通过反射，拿到类型中的属性；属性名称为columnLabel
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true); // 允许访问私有成员
                    field.set(t,value); // 给t对象的columnLabel属性赋值
                }
                return t;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            JDBCUitls.closeResource(null,ps,resultSet);
        }
    }

    /**
     * 返回多条数据的通用查询
     * @param connection 从外部传入数据库连接对象，方便执行事务
     * @param clazz
     * @param sql 当数据库表列名与实体对象属性名称不一致时，要给数据库表列名自定义列名，从而和实体属性值对应
     * @param args
     * @param <T>
     * @return
     */
    public <T> List<T> QueryList(Connection connection,Class<T> clazz, String sql, Object ...args){
        PreparedStatement ps =null;
        ResultSet resultSet =null;
        try {
            ps = connection.prepareStatement(sql);

            for (int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }

            // 拿到数据集
            resultSet = ps.executeQuery();
            // 拿到数据集元数据（ResultSet）
            ResultSetMetaData rsmd = resultSet.getMetaData();
            // 获取表字段的总数据
            int columnCount = rsmd.getColumnCount();

            // 创建泛型集合
            ArrayList<T> list = new ArrayList<>();

            // 循环所有数据
            while (resultSet.next()){
                // 通过类型，反射创建对象
                T t = clazz.newInstance();

                // 通过循环查询数据的字段数，来为对象赋值
                for (int i=0; i<columnCount;i++){
                    // 获取每个列的值
                    Object value = resultSet.getObject(i + 1);

                    // 获取每列的的名称
                    String columnLabel = rsmd.getColumnLabel(i + 1);

                    // 通过反射，拿到类型中的属性；属性名称为columnLabel
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true); // 允许访问私有成员
                    field.set(t,value); // 给t对象的columnLabel属性赋值
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            JDBCUitls.closeResource(null,ps,resultSet);
        }

    }


    /**
     * 公共的增删改操作方法
     * @param connection 从外部传入数据库连接对象，方便执行事务
     * @param sql
     * @param args
     */
    public void Update(Connection connection,String sql,Object ...args)  {
        PreparedStatement ps=null;
        try {
            // 1.创建数据库连接对象
            //connection = JDBCUitls.getConnection();
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
            JDBCUitls.closeResource(null,ps);
        }

    }


}
