package com.github.wangfeng.learn.springboot.mybatis.single.service.impl;

import com.github.wangfeng.learn.springboot.mybatis.single.config.DataSource;
import com.github.wangfeng.learn.springboot.mybatis.single.config.DataSourceType;
import com.github.wangfeng.learn.springboot.mybatis.single.entity.ds1.User;
import com.github.wangfeng.learn.springboot.mybatis.single.dao.ds1.UserDao4Ds1;
import com.github.wangfeng.learn.springboot.mybatis.single.service.UserService4Ds1;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-03-03 08:27:38
 */
@Service("userService")
public class UserService4Ds1Impl implements UserService4Ds1 {
    @Resource
    private UserDao4Ds1 userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    @DataSource(DataSourceType.db1)
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userDao.deleteById(id) > 0;
    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void transaction1() {
        User user = new User();
        user.setName("新增");
        user.setAge(32);
        userDao.insert(user);

        User user1 = new User();
        user1.setName("新增1");
        user1.setAge(23);
        userDao.insert(user1);

        mockException();

    }

    @Override
    public void mockException() {
        throw new RuntimeException();
    }
}