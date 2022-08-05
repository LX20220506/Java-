package com.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boot.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    /**
     * 拿到所有的account信息
     * @return
     */
    // List<Account> getAllAccount();

}
