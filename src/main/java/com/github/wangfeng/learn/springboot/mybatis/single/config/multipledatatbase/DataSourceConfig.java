package com.github.wangfeng.learn.springboot.mybatis.single.config.multipledatatbase;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
//    @Bean("ds1DataSourceProperties")
//    @ConfigurationProperties(prefix = "spring.datasource.ds1")
//    public DataSourceProperties ds1DataSourceProperties() {
//        return new DataSourceProperties();
//    }

    @Bean("ds1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ds1")
    public DataSource ds1DataSource() {
//        return dataSourceProperties.initializeDataSourceBuilder().build();
        return DataSourceBuilder.create().build();
    }

//    @Bean("ds2DataSourceProperties")
//    @ConfigurationProperties(prefix = "spring.datasource.ds2")
//    public DataSourceProperties ds2DataSourceProperties() {
//        return new DataSourceProperties();
//    }

    @Bean("ds2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ds2")
    public DataSource ds2DataSource() {
//        return dataSourceProperties.initializeDataSourceBuilder().build();
        return DataSourceBuilder.create().build();
    }
}
