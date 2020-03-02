package com.github.wangfeng.learn.springboot.mybatis.single.mapper;

import com.github.wangfeng.learn.springboot.mybatis.single.po.entity.BlogDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class BlogMapperTest {

    @Autowired
    private BlogMapper blogMapper;

    @Test
    public void testInsert() {
        BlogDO insertDO = new BlogDO();
        insertDO.setName("wangfeng");
        insertDO.setStatus(1);

        int insertResult = blogMapper.insert(insertDO);
        log.info("insert result = [{}]", insertResult);
        log.info("insert entity id=[{}]", insertDO.getId());

    }

    @Test
    public void testInsertMap() {
        Map insertMap = new HashMap();
        insertMap.put("name", "wangfeng");
        insertMap.put("status", 2);

        int insertResult = blogMapper.insertWithMap(insertMap);
        log.info("insert result = [{}]", insertResult);

    }


}