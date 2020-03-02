package com.github.wangfeng.learn.springboot.mybatis.single.service;

import com.github.wangfeng.learn.springboot.mybatis.single.po.entity.CountryDO;

import java.util.List;

/**
 * (CountryDO)表服务接口
 *
 * @author makejava
 * @since 2020-03-01 22:28:19
 */
public interface CountryService {

    void propagationRequired();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CountryDO queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CountryDO> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    CountryDO insert(CountryDO country);

    /**
     * 修改数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    CountryDO update(CountryDO country);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}