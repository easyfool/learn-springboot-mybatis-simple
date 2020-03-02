package com.github.wangfeng.learn.springboot.mybatis.single.service.impl;

import com.github.wangfeng.learn.springboot.mybatis.single.mapper.BlogMapper;
import com.github.wangfeng.learn.springboot.mybatis.single.po.entity.BlogDO;
import com.github.wangfeng.learn.springboot.mybatis.single.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int addBlog() {
        BlogDO blogDO = new BlogDO();
        blogDO.setName("hhhhh");
        blogDO.setStatus(1);
        int insert = blogMapper.insert(blogDO);
        try {
            throw new RuntimeException("ceshi ");
        } catch (RuntimeException e) {
            System.out.println("catched exception");
        }
        return insert;

    }
}
