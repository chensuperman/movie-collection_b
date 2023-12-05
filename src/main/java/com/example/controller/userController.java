package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.user;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.userService;

import java.util.List;

@Slf4j
@RestController
public class userController {

    @Autowired
    private userService userService;

    // 删除用户
    @DeleteMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable Integer id){
        log.info("根据id删除用户:{}" ,id);
        //调用service删除用户
        userService.deleteUser(id);
        return Result.success();
    }

    //获取所有用户的个人信息列表（除了管理员）
    @GetMapping("/getAllUser")
    public Result getAllUser(){
        log.info("获取所有用户的个人信息列表");
        List<user> AllUserList = userService.getAllUserList();
        return Result.success(AllUserList);
    }
}
