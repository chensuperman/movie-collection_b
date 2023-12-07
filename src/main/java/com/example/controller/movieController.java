package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.movie;
import com.example.pojo.movieSimple;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    //删除电影
    @DeleteMapping("/deleteMovie/{movieIds}")
    public Result deleteMovie(@PathVariable List<Integer> movieIds){
        log.info("删除电影数据:{}",movieIds);

        //调用service
        movieService.deleteMovie(movieIds);
        return Result.success();
    }

    //添加电影
    @PostMapping("/addMovie")
    public Result addMovie(@RequestBody movie movie){

        log.info("添加电影数据:{}",movie);
        //调用service
        movieService.addMovie(movie);
        return Result.success();
    }

    //获取搜索的电影by名字
    @GetMapping("/showMovieByTitle/{title}")
    public Result showMovieMovieByTitle(@PathVariable String title){
        log.info("显示电影数据:{}",title);

        //调用service
        List<movie> movieList = movieService.showMovieMovieByTitle(title);

        List<movieSimple> movieSimpleList = movieList.stream()
                .map(movie -> new movieSimple(movie.getMovieId(), movie.getTitle()))
                .toList();

        return Result.success(movieSimpleList);
    }

   //获取搜索的电影by电影ID
    @GetMapping("/showMovieById/{movieId}")
    public Result showMovieMovieByMovieId(@PathVariable Integer movieId){
       movie movie= movieService.showMovieById(movieId);
        return Result.success(movie);
    }
}
