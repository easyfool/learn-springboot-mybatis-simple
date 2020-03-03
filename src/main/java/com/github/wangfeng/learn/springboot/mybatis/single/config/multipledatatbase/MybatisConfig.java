package com.github.wangfeng.learn.springboot.mybatis.single.config.multipledatatbase;

import com.github.wangfeng.learn.springboot.mybatis.single.config.DataSourceType;
import com.github.wangfeng.learn.springboot.mybatis.single.config.DynamicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@MapperScan(basePackages = "com.github.wangfeng.learn.springboot.mybatis.single.dao")
public class MybatisConfig {
    @Bean
    public DynamicDataSource dataSource(@Qualifier("ds1DataSource") DataSource ds1, @Qualifier("ds1DataSource") DataSource ds2) {
        Map<Object, Object> map = new HashMap<>();
        map.put(DataSourceType.db1, ds1);
        map.put(DataSourceType.db2, ds2);

        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(ds1);
        return dynamicDataSource;

    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DynamicDataSource dynamicDataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource);
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*/*.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(DynamicDataSource dynamicDataSource) {
        return new DataSourceTransactionManager(dynamicDataSource);
    }
}
