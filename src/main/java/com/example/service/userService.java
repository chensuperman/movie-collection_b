package com.example.service;

import com.example.pojo.user;

import java.util.List;

public interface userService {
    //批量删除用户
    void deleteUser(List<Integer> ids);

    //获取所有用户信息
    List<user> getAllUserList();

    //登录
    user login(user user);

    //注册
    void register(user user);


    //修改密码
    void updatePassword(user user);

    //修改头像
    void updateAvatar(user user);
}
