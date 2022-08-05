package com.boot.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.entity.Account;
import com.boot.mapper.AccountMapper;
import com.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper,Account> implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    /**
     * 查询所有Account
     * @return
     */
    @Override
    public List<Account> getAllAccount() {
        return accountMapper.selectList(null);
    }

    /**
     * 分页查询
     */
    public  Page<Account> getPage(Integer index,Integer size){
        Page<Account> accountPage = new Page<>(index, size);
        return accountMapper.selectPage(accountPage, null);
    }
}
