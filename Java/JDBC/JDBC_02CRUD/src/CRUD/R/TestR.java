package CRUD.R;

import JDBCUtils.JDBCUitls;
import org.junit.Test;
import Entity.Furit;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestR {
    @Test
    public void TestFruit1() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            // 1.创建数据库上下文
            connection = JDBCUitls.getConnection();
            // 2.预编译sql语句
            String sql="select * from t_fruit where fid = ?";
            ps = connection.prepareStatement(sql);
            // 3.填充参数
            ps.setInt(1,10);
            // 4.执行操作,并返回结果集
            resultSet = ps.executeQuery();
            // 输出结果集
            if (resultSet.next()){
                // 拿到每个字段的数据
                int fId = resultSet.getInt(1);
                String fname = resultSet.getString(2);
                int price = resultSet.getInt(3);
                int fcount = resultSet.getInt(4);
                String remark = resultSet.getString(5);

                Furit furit = new Furit(fId, fname, price, fcount, remark);
                System.out.println(furit.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 5.释放资源
            JDBCUitls.closeResource(connection,ps,resultSet);
        }
    }


    /**
     * 返回单条数据的通用查询
     * @param clazz
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T> T Query(Class<T> clazz ,String sql,Object ...args) {

        Connection connection = null;
        PreparedStatement ps =null;
        ResultSet resultSet =null;
        try {
            connection = JDBCUitls.getConnection();
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
            JDBCUitls.closeResource(connection,ps,resultSet);
        }
    }

    /**
     * 返回多条数据的通用查询
     * @param clazz
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T> List<T> QueryList(Class<T> clazz,String sql,Object ...args){
        Connection connection = null;
        PreparedStatement ps =null;
        ResultSet resultSet =null;
        try {
            connection = JDBCUitls.getConnection();
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
            JDBCUitls.closeResource(connection,ps,resultSet);
        }

    }

    /**
     * 测试返回单条数据的公共查询
     */
    @Test
    public void TestQuery(){
        String sql ="select * from t_fruit where fid = ?";
        Furit furit = Query(Furit.class, sql, 13);

        System.out.println(furit.toString());
    }


    /**
     * 测试返回多条数据的公共查询
     */
    @Test
    public void TestQueryList(){
        String sql ="select * from t_fruit where fid > ?";
        List<Furit> furits = QueryList(Furit.class, sql, 13);

        // 循环输出
        furits.forEach(System.out::println);
    }

}
