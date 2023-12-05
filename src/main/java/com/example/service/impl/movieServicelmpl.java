package com.example.service.impl;

import com.example.pojo.movie;
import com.example.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapper.movieMapper;
import java.util.List;


@Service
public class movieServicelmpl implements movieService {
    @Autowired
    private movieMapper movieMapper;


    //查询所有的电影数据
    @Override
    public List<movie> getMovieList(Integer num) {
        return  movieMapper.movieList(num);
    }
}
