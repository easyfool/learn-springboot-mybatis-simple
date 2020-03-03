package com.github.wangfeng.learn.springboot.mybatis.single.config;

/**
 * 动态数据源上下文管理：设置数据源，获取数据源，清除数据源
 */
public class DataSourceContextHolder {
    /**
     * 存放当前线程使用的数据源类型
     */
    private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源
     *
     * @param dataSource
     */
    public static void setDataSource(DataSourceType dataSource) {
        contextHolder.set(dataSource);
    }

    /**
     * 获取数据源
     *
     * @return
     */
    public static DataSourceType getDataSource() {
        return contextHolder.get();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        contextHolder.remove();
    }

}
