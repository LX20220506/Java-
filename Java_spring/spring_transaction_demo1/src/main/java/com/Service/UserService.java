package com.Service;

import com.Dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional // 启用事务
public class UserService {

    @Resource
    private UserDao userDao;


    public void accountMoney() {
        userDao.reduceMoney();
        int aa = 10 / 0;
        userDao.addMnoey();
    }

}


