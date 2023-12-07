package com.example.service;

import com.example.pojo.movie;

import java.util.List;

public interface movieService {
    //获取所有电影的数据
    List<movie> getMovieList(Integer num);


    //批量删除电影
    void deleteMovie(List<Integer> movieIds);

    //添加电影
    void addMovie(movie movie);

    //获取搜索的电影by名字
    List <movie> showMovieMovieByTitle(String title);

    movie showMovieById(Integer movieId);
}
