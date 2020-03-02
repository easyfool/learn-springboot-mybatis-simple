package com.github.wangfeng.learn.springboot.mybatis.single.service.impl;

import com.github.wangfeng.learn.springboot.mybatis.single.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BlogServiceImplTest {
    @Autowired
    private BlogService blogService;

    @Test
    public void testAddTransaction() {
        int i = blogService.addBlog();
        System.out.println(i);
    }

}