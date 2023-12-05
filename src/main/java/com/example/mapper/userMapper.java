package com.example.mapper;

import com.example.pojo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {

    //根据用户id删除用户
    @Update("update user_information set user_privilege = 3 where user_id = #{id}")//user_privilege=3代表已被删除
    void deleteById(Integer id);

    //查询所有用户信息
    @Select("select * from user_information where user_privilege=1")
    List<user> AllUserList();

    //根据用户的用户名或邮箱和密码查询信息
    @Select("select * from user_information where (username = #{username} and password = #{password}) or (user_email = #{userEmail} and password = #{password})")
    user gitByUsernameAndPassword(user user);

    //创建账号
   @Insert("insert into user_information(password,user_email,username,user_privilege) values(#{password},#{userEmail},#{username},1)")
   void register(user user);

}
