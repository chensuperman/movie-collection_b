package com.example.mapper;

import com.example.pojo.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {

    //根据用户id删除用户
    @Delete("delete from user_information where user_id = #{id}")
    void deleteById(Integer id);

    //根据用户的用户名和密码查询信息
    @Select("select * from user_information where username = #{username} and password = #{password}")
    user gitByUsernameAndPassword(user user);


    //查询所有用户信息
    @Select("select * from user_information where user_privilege=1")
    List<user> AllUserList();
}
