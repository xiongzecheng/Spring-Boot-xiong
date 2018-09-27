package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.UserServices;
import com.example1.springdatajpa.dao.UserRepository;
import com.example1.springdatajpa.entity.SysUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public  class UserServicesImpl implements UserServices{

    @Resource
    private UserRepository userRepository;
    @Override
    public List<SysUser> getAll() {
        return userRepository.findAll();
    }

    @Override
    public SysUser getOne(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public SysUser findByAccount(String account) {
        return userRepository.findByAccount(account);
    }

    @Override
    public List<SysUser> findByPasswordLength(Integer length) {
        return userRepository.findByPasswordLessThan(length);
    }

    @Override
    public List<SysUser> findOrderByFans(String nickname) {
        return userRepository.findUsers(nickname);
    }
}
