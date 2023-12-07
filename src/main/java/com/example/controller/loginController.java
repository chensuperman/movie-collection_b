package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.user;
import com.example.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@Slf4j
@RestController
public class loginController {
    @Autowired
    private userService userService;

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public Result login(@RequestBody user user) {

        log.info("登录用户:{}", user);
        //调用service登录用户

        user e = userService.login(user);
        if(e==null){
            return Result.error("用户名或密码有误！");
        }else if(e.getUserPrivilege() == 3){
            return Result.error("该用户已注销！");
        }else {
            return Result.success(e);
        }

    }
}
