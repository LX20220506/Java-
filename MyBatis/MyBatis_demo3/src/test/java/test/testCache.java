package test;


import com.mybatis.entity.Emp;
import com.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class testCache {

    /**
     * 测试二级缓存
     */
    @Test
    public void testTowCache(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            EmpMapper empMapper1 = sqlSession1.getMapper(EmpMapper.class);
            Emp emp1 = empMapper1.getEmpById(1);
            System.out.println(emp1);
            sqlSession1.close();

            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            EmpMapper empMapper2 = sqlSession2.getMapper(EmpMapper.class);
            Emp emp2 = empMapper2.getEmpById(1);
            System.out.println(emp2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
