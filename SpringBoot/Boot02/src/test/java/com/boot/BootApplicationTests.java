package com.boot;

import com.boot.entity.Account;
import com.boot.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class BootApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void TestJdbcTemplate(){
        jdbcTemplate.queryForList("select * from t_account");
        System.out.println();
    }

    @Autowired
    AccountService accountService;

    @Test
    void TestMyBatisSelectAllAccount(){
        List<Account> allAccount = accountService.getAllAccount();
        System.out.println(allAccount);
    }

    // @Autowired
    // StringRedisTemplate stringRedisTemplate;
    //
    // @Test
    // public void testRedis(){
    //     ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
    //     operations.set("name","tom");
    //     System.out.println(operations.get("name"));
    // }


}
