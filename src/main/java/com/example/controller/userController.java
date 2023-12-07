package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.user;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.service.userService;

import java.util.List;

@Slf4j
@RestController
public class userController {

    @Autowired
    private userService userService;

    // 批量删除用户
    @DeleteMapping("/deleteUser/{ids}")
    public Result deleteUser(@PathVariable List <Integer> ids){
        log.info("根据id删除用户:{}" ,ids);
        //调用service删除用户
        userService.deleteUser(ids);
        return Result.success();
    }

    //获取所有用户的个人信息列表（除了管理员）
    @GetMapping("/getAllUser")
    public Result getAllUser(){
        log.info("获取所有用户的个人信息列表");
        List<user> AllUserList = userService.getAllUserList();
        return Result.success(AllUserList);
    }

    //修改密码
    @PostMapping("/updatePassword")
    public Result updatePassword(@RequestBody user user){
        log.info("修改密码：{}",user);
        userService.updatePassword(user);
        return Result.success();
    }

    //修改头像
    @PostMapping("/updateAvatar")
    public Result updateAvatar(@RequestBody user user){
        log.info("修改头像：{}",user);
        userService.updateAvatar(user);
        return Result.success();
    }



}
