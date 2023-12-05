package com.example.service;

import com.example.pojo.movie;

import java.util.List;

public interface movieService {
    //获取所有电影的数据
    List<movie> getMovieList(Integer num);



}
