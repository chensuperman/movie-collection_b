package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.user;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.userService;

@Slf4j
@RestController
public class registerController {

    @Autowired
    private userService userService;

         @CrossOrigin(origins = "*")
        @PostMapping("/register")
        public Result register(@RequestBody user user){
            log.info("注册用户:{}",user);

            //调用service判断用户是否存在
            user isExist = userService.login(user);

            if(isExist != null){
                return Result.error("用户已存在！");
            }else{
                userService.register(user);
                return Result.success();
            }

        }

}
