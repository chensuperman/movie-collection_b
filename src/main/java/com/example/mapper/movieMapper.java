package com.example.mapper;

import com.example.pojo.movie;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface movieMapper {
    //查询电影
    @Select("select * from movies where #{num}<= movie_id and movie_id <(#{num}+10) ")
    List<movie> movieList(Integer num);


    //批量删除电影
    void deleteMovie(List<Integer> movieIds);

    //添加电影
    @Insert("insert into  movies(img,title, director, writer, actor, type, country, language, release_year, time, bename, imdb, rating, rating_number)" +
            " values(#{img},#{title},#{director},#{writer},#{actor},#{type},#{country},#{language},#{releaseYear},#{time},#{bename},#{imdb},#{rating},#{ratingNumber});")
    void addMovie(movie movie);

    //获取搜索的电影by名字
   @Select("SELECT * FROM movies WHERE title LIKE CONCAT('%', #{title}, '%')")
    List<movie> showMovieMovieByTitle(String title);

    //获取搜索的电影by电影ID
   @Select("SELECT * FROM movies WHERE movie_id = #{movieId}")
    movie showMovieById(Integer movieId);
}
