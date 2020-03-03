package com.github.wangfeng.learn.springboot.mybatis.single.service.impl;

import com.github.wangfeng.learn.springboot.mybatis.single.service.UserService4Ds1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserService4Ds1ImplTest {

    @Autowired
    private UserService4Ds1 userService4Ds1;

    @Test
    public void testTransation() {
        userService4Ds1.transaction1();

    }

}