package com.github.wangfeng.learn.springboot.mybatis.single.dao.ds1;

import com.github.wangfeng.learn.springboot.mybatis.single.entity.ds1.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDao4Ds1Test {
    @Autowired
    private UserDao4Ds1 userDao4Ds1;

    @Test
    public void testSelect() {
        User queryUser = new User();
        List<User> users = userDao4Ds1.queryAll(queryUser);
        System.out.println(users);

    }

}