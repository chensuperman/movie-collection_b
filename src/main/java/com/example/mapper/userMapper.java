package com.example.mapper;

import com.example.pojo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {

    //根据用户ids删除用户
    void deleteById(List<Integer> ids);

    //查询所有用户信息
    @Select("select * from user_information where user_privilege=1")
    List<user> AllUserList();

    //根据用户的用户名或邮箱和密码查询信息
    @Select("select * from user_information where (username = #{username} and password = #{password}) or (user_email = #{userEmail} and password = #{password})")
    user gitByUsernameAndPassword(user user);

    //创建账号
   @Insert("insert into user_information(password,user_email,username,user_privilege) values(#{password},#{userEmail},#{username},1)")
   void register(user user);

   //修改密码
    @Update("update user_information set password=#{password}  where user_id=#{userId}")
    void updatePassword(user user);

    @Update("update user_information set avatar=#{avatar}  where user_id=#{userId}")
    void updateAvatar(user user);
}
