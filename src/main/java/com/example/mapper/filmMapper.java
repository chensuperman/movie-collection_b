package com.example.mapper;

import com.example.pojo.film;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface filmMapper {
    //查询所有电影
    @Select("select * from film")
    List<film> AllFilmList();
}
