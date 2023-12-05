package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.film;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.filmService;

import java.util.List;

@Slf4j
@RestController
public class filmController {

    @Autowired
    private filmService filmService;


    //获取所有电影的数据
    @GetMapping("/getAllFilmList")
    public Result AllFilmList(){
        log.info("查询全部电影数据");

        //调用service
        List<film> AllFilmList =filmService.getAllFilmList();
        return Result.success(AllFilmList);
    }



}
