package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.movieService;

import java.util.List;

@Slf4j
@RestController
public class movieController {

    @Autowired
    private movieService movieService;


    //获取电影的数据
    @GetMapping("/getMovieList/{num}")
    public Result AllMovieList(@PathVariable Integer num){
        log.info("查询电影数据:{}",num);

        //调用service
        List<movie> movieList =movieService.getMovieList(num);
        return Result.success(movieList);
    }



}
