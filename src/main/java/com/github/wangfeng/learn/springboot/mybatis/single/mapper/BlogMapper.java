package com.github.wangfeng.learn.springboot.mybatis.single.mapper;

import com.github.wangfeng.learn.springboot.mybatis.single.po.entity.BlogDO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface BlogMapper {

    int insert(BlogDO record);

    int insertWithMap(Map map);




}