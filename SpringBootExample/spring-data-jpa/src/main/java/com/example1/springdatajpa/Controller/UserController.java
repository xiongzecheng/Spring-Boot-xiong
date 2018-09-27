package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.UserServices;
import com.example1.springdatajpa.entity.SysUser;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserServices userServices;


    @GetMapping(value = "/all")
    public List<SysUser> getAll(){
        return userServices.getAll();
    }


    @GetMapping(value = "/one/{id}")
    public SysUser getOne(@PathVariable("id") Integer id){
        return userServices.getOne(id);
    }

    @GetMapping(value = "/account/{account}")
    public SysUser getOneByNickname(@PathVariable("account") String account){
        return userServices.findByAccount(account);
    }


    @GetMapping(value = "/nickname/{nickname}")
    public List<SysUser> findOrderByFans(@PathVariable("nickname") String nickname){
        return userServices.findOrderByFans(nickname);
    }
}
