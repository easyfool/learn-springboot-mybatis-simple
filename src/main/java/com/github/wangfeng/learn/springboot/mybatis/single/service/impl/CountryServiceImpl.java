package com.github.wangfeng.learn.springboot.mybatis.single.service.impl;

import com.github.wangfeng.learn.springboot.mybatis.single.po.entity.CountryDO;
import com.github.wangfeng.learn.springboot.mybatis.single.mapper.CountryMapper;
import com.github.wangfeng.learn.springboot.mybatis.single.service.BlogService;
import com.github.wangfeng.learn.springboot.mybatis.single.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CountryDO)表服务实现类
 *
 * @author makejava
 * @since 2020-03-01 22:28:21
 */
@Service("countryService")
public class CountryServiceImpl implements CountryService {
    @Autowired
    private BlogService blogService;
    @Resource
    private CountryMapper countryDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void propagationRequired() {

        CountryDO countryDO = new CountryDO();
        countryDO.setCountryName("singopore");
        countryDO.setCountryCode("xinjiabo");
        countryDao.insert(countryDO);
        blogService.addBlog();

    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CountryDO queryById(Object id) {
        return this.countryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CountryDO> queryAllByLimit(int offset, int limit) {
        return this.countryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    @Override
    public CountryDO insert(CountryDO country) {
        this.countryDao.insert(country);
        return country;
    }

    /**
     * 修改数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    @Override
    public CountryDO update(CountryDO country) {
        this.countryDao.update(country);
        return this.queryById(country.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.countryDao.deleteById(id) > 0;
    }


}