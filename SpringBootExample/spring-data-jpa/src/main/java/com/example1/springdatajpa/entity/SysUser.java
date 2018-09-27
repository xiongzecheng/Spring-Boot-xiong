package com.example1.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 用@Entity注解标注本类是一个可持久化类
 * 用@Id注解指定主键
 * 用@GeneratedValue注解标注主键的策略，mysql为自增
 * 用@Data 注解
 * */
@Entity
@Data
public class SysUser implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private  String password;

    private String nickname;
    private Integer fans;


}
