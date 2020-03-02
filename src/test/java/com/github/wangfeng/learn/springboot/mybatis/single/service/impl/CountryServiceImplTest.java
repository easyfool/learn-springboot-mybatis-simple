package com.github.wangfeng.learn.springboot.mybatis.single.service.impl;

import com.github.wangfeng.learn.springboot.mybatis.single.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CountryServiceImplTest {

    @Autowired
    private CountryService countryService;

    @Test
    public void testPropagationRequired() {
        countryService.propagationRequired();

    }

}