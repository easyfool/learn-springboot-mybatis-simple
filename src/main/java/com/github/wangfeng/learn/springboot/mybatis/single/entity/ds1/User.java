package com.github.wangfeng.learn.springboot.mybatis.single.entity.ds1;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-03-03 08:27:38
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 632074373271828462L;
    
    private Long id;
    
    private String name;
    
    private Integer age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}