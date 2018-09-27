package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserServices  {

    /**
     * 原生获得
     * 1.查询所有用户
     * 2.根据ID查询用户
     * @return
     */
    List<SysUser> getAll();
    SysUser getOne(Integer id);

    /**
     * 解析方法名获取
     * 1.根据账号查询
     * 2.根据密码长度查询
     * @param account
     * @return
     */
    SysUser findByAccount(String account);
    List<SysUser> findByPasswordLength(Integer length);


    List<SysUser> findOrderByFans(String nickname);


}
