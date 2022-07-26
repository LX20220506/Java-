package test;

import com.mybatis.entity.Emp;
import com.mybatis.entity.EmpExample;
import com.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testQBC {

    @Test
    public void testCRUD(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
            // List<Emp> emps = empMapper.selectByExample(null);
            // emps.forEach(System.out::println);

            EmpExample empExample = new EmpExample();
            empExample.createCriteria().andAgeBetween(18,30);
            List<Emp> emps = empMapper.selectByExample(empExample);
            emps.forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
