package com.example.service.impl;

import com.example.pojo.movie;
import com.example.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapper.movieMapper;

import java.util.List;


@Service
public class movieServiceImpl implements movieService {
    @Autowired
    private movieMapper movieMapper;


    //查询所有的电影数据
    @Override
    public List<movie> getMovieList(Integer num) {
        return  movieMapper.movieList(num);
    }

    //删除电影
    @Override
    public void deleteMovie(List<Integer> movieIds) {
         movieMapper.deleteMovie(movieIds);
    }

    //添加电影
    @Override
    public void addMovie(movie movie) {
        movieMapper.addMovie(movie);
    }

    //获取搜索的电影by名字
    @Override
    public  List<movie> showMovieMovieByTitle(String title) {
      return  movieMapper.showMovieMovieByTitle(title);
    }

    //获取搜索的电影by电影ID
    @Override
    public movie showMovieById(Integer movieId) {
        return movieMapper.showMovieById(movieId);
    }


}
