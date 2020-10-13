package com.github.wangfeng.learn.springboot.mybatis.single.mapper;

import com.github.wangfeng.learn.springboot.mybatis.single.po.entity.CountryDO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CountryDO)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-01 22:28:12
 */
public interface CountryMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CountryDO queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CountryDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param country 实例对象
     * @return 对象列表
     */
    List<CountryDO> queryAll(CountryDO country);

    /**
     * 新增数据
     *
     * @param country 实例对象
     * @return 影响行数
     */
    int insert(CountryDO country);

    /**
     * 修改数据
     *
     * @param country 实例对象
     * @return 影响行数
     */
    int update(CountryDO country);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}