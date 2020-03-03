package com.github.wangfeng.learn.springboot.mybatis.single.dao.ds2;

import com.github.wangfeng.learn.springboot.mybatis.single.entity.ds1.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDao4Ds2Test {
    @Autowired
    private UserDao4Ds2 userDao4Ds2;

    @Test
    public void testSelect() {
        User queryUser = new User();
        List<User> users = userDao4Ds2.queryAll(queryUser);
        System.out.println(users);

    }

}