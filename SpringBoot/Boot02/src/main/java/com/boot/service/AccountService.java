package com.boot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.boot.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService extends IService<Account> {

    List<Account> getAllAccount();

    Page<Account> getPage(Integer index, Integer size);

}
