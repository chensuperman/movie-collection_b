package com.example.service.impl;

import com.example.pojo.user;
import com.example.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapper.userMapper;

import java.util.List;

@Service
public class userServicelmpl implements userService{

    @Autowired
    private userMapper userMapper;

    //批量删除用户
    @Override
    public void deleteUser(List<Integer> ids) {
        userMapper.deleteById(ids);
    }

    //查询所有用户信息
    @Override
    public List<user> getAllUserList() {
        return userMapper.AllUserList();
    }

    //用户登录
    @Override
    public user login(user user) {
        return userMapper.gitByUsernameAndPassword(user);
    }

    //用户注册
    @Override
    public void register(user user) {
        userMapper.register(user);
    }

    //修改密码
    @Override
    public void updatePassword(user user) {
      userMapper.updatePassword(user);
    }

    //修改头像
    @Override
    public void updateAvatar(user user) {
        userMapper.updateAvatar(user);
    }


}
