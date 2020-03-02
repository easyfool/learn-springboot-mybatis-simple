package com.github.wangfeng.learn.springboot.mybatis.single.po.entity;

import java.io.Serializable;

/**
 * (CountryDO)实体类
 *
 * @author makejava
 * @since 2020-03-01 22:28:10
 */
public class CountryDO implements Serializable {
    private static final long serialVersionUID = 798233563721822428L;
    /**
    * 主键
    */
    private Object id;
    
    private String countryName;
    
    private String countryCode;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}