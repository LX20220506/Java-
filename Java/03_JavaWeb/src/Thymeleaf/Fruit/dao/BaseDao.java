package Thymeleaf.Fruit.dao;


import Thymeleaf.Fruit.JDBCUitls.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BaseDao<T> {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 通用的增删改方法
     * @param sql
     * @param param
     * @return
     */
    public int update(String sql, Object ... param) {

        Connection connection = JDBCUtils.getConnection();

        int count = 0;
        try {
            count = queryRunner.update(connection, sql, param);
        } catch (SQLException e) {
            e.printStackTrace();

            throw new RuntimeException(e);

        } finally {

            // 关闭数据库连接
            JDBCUtils.releaseConnection(connection);

        }

        return count;
    }

    /**
     * 查询单个对象的通用方法
     * @param clazz
     * @param sql
     * @param param
     * @return
     */
    public T getBean(Class<T> clazz, String sql, Object ... param) {

        Connection connection = JDBCUtils.getConnection();

        T bean = null;
        try {
            bean = queryRunner.query(connection, sql, new BeanHandler<>(clazz), param);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {

            // 关闭数据库连接
            JDBCUtils.releaseConnection(connection);

        }

        return bean;
    }

    /**
     * 查询集合对象的通用方法
     * @param clazz
     * @param sql
     * @param param
     * @return
     */
    public List<T> getBeanList(Class<T> clazz, String sql, Object ... param) {

        Connection connection = JDBCUtils.getConnection();

        List<T> beanList = null;

        try {
            beanList = queryRunner.query(connection, sql, new BeanListHandler<>(clazz), param);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {

            // 关闭数据库连接
            JDBCUtils.releaseConnection(connection);
        }

        return beanList;
    }

}
