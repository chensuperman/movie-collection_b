package com.example.service;

import com.example.pojo.link;
import com.example.pojo.movie;

import java.util.List;

public interface collectionService {


    //添加收藏
    void addCollection(link link);

    //删除收藏
    void deleteCollection(link link);

    //获取收藏的电影列表
//    List<movie> getCollectionList(List<link> link);

    //获取用户的收藏关系列表
    List<link> getLinkList(Integer userId);

    //获取收藏的电影列表
    List<movie> getCollectionList(List<link> linkList);
}
