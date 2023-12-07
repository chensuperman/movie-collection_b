package com.example.mapper;

import com.example.pojo.link;
import com.example.pojo.movie;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface collectionMapper {

    //添加收藏
    @Insert("insert into user_movie(user_id,movie_id) values (#{userId},#{movieId})")
    void insertCollection(link link);

    //删除收藏
    @Delete("delete from user_movie where user_id = #{userId} and movie_id = #{movieId}")
    void deleteCollection(link link);

    //获取用户的收藏关系列表
    @Select("select * from user_movie where user_id = #{userId}")
    List<link> getLinkList(Integer userId);

//    List<movie> getCollectionList(link link);


}
