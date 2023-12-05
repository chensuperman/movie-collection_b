package com.example.mapper;

import com.example.pojo.movie;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface movieMapper {
    //查询电影
    @Select("select * from movie where #{num}<= movie_id and movie_id <(#{num}+10) ")
    List<movie> movieList(Integer num);




}
