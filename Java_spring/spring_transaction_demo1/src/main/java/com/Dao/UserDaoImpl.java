package com.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    // 将JdbcTemplate注入
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 加钱的方法
    @Override
    public void addMnoey() {
        String sql = "UPDATE t_user SET money=money+? WHERE name=?";
        Object[] args={100,"tom"};
        jdbcTemplate.update(sql,args);
    }

    // 减钱的方法
    @Override
    public void reduceMoney() {
        String sql = "UPDATE t_user SET money=money-? WHERE name=?";
        Object[] args={100,"jie"};
        jdbcTemplate.update(sql,args);
    }
}
