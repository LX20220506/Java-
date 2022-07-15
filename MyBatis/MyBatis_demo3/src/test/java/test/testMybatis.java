package test;

import com.mybatis.entity.Emp;
import com.mybatis.mapper.EmpMapper;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class testMybatis {


    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpById(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpAndDeptById(1);
        System.out.println(emp.getEmpName());
        System.out.println("======================");
        System.out.println(emp.getDept().getDeptName());
    }
}
