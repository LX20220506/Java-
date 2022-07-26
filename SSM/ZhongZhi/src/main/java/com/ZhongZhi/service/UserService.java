package com.ZhongZhi.service;

import com.ZhongZhi.entity.User;
import com.ZhongZhi.entity.UserExample;
import com.ZhongZhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 判断用户的登录
     */
    public User getLogin(User user){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(user.getUserName()).andUserPwdEqualTo(user.getUserPwd());
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size()<=0){
            return null;
        }
        return users.get(0);
    }

    /**
     * 查询所有用户的信息
     */
    public List<User> getAllUser(){
        return userMapper.selectByExample(null);
    }


}
