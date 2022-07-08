package com.DaoImpl;

import com.dao.UserDAO;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl")
public class userDaoImpl implements UserDAO {
    @Override
    public void add() {
        System.out.println("UserDAO add.............");
    }
}
