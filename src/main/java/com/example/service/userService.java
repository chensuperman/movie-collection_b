package com.example.service;

import com.example.pojo.user;

import java.util.List;

public interface userService {
    //删除用户
    void deleteUser(Integer id);

    //获取所有用户信息
    List<user> getAllUserList();

    //登录
    user login(user user);

    //注册
    void register(user user);



}
