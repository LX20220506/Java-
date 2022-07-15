package com.mybatis.mapper;

import com.mybatis.entity.User;

import java.util.List;

public interface UserMapper {

    /**
     * 添加方法
     */
    int insertUser();

    /**
     * 修改方法
     */
    int updateUser();

    /**
     * 删除方法
     */
    int deleteUserById();

    /**
     * 查询一条数据
     */
    User findUser();

    /**
     * 查询集合
     */
    List<User> queryUser();
}
