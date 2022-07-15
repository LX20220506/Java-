package com.mybatis.test;

import com.mybatis.entity.User;
import com.mybatis.mapper.ParameterMapper;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class MyBatisTest {


    @Test
    public void testInsertByUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User(null, "admin", "123456", "男");
        parameterMapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void testInsertByUserReturnId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User(null, "李四", "123456", "女");
        parameterMapper.insertUserReturnId(user);
        System.out.println(user);
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        int result = parameterMapper.deleteById(1);
        System.out.println(result);
    }


    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        User user = parameterMapper.getUserById(4);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = parameterMapper.getAllUser();
        System.out.println(users);
    }

    @Test
    public void testGetUserReturnMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> userMap = parameterMapper.getUserByIdReturnMep(6);
        System.out.println(userMap);
    }

    @Test
    public void testGetAllUserReturnMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> userMap = parameterMapper.getAllUserReturnMep();
        System.out.println(userMap);
    }

    @Test
    public void testGetAllUserReturnListMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        List<Map<String, Object>> userMao = parameterMapper.getAllUserReturnListMap();
        System.out.println(userMao);
    }


    @Test
    public void testGetLickSelect(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = parameterMapper.getLickSelect("m");
        System.out.println(users);
    }

    @Test
    public void testDeleteMord(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        int result = parameterMapper.deleteMord("6,7,8");
        System.out.println(result);
    }


    @Test
    public void testGetUserByTable(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = parameterMapper.getUserByTable("t_user");
        System.out.println(users);
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper parameterMapper = sqlSession.getMapper(ParameterMapper.class);
        int count = parameterMapper.getCount();
        System.out.println(count);
    }
}
