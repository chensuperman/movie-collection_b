package com.example.service.impl;

import com.example.pojo.link;
import com.example.pojo.movie;
import com.example.service.collectionService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mapper.collectionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class collectionServiceImpl implements collectionService {
    @Autowired
    private collectionMapper  collectionMapper;

    //添加收藏
    @Override
    public void addCollection(link link) {
        collectionMapper.insertCollection(link);

    }

    //删除收藏
    @Override
    public void deleteCollection(link link) {
        collectionMapper.deleteCollection(link);
    }

    //获取用户的收藏关系列表
    @Override
    public List<link> getLinkList(Integer userId) {
        return collectionMapper.getLinkList(userId);
    }

    //获取收藏的电影列表
    @Override
    public List<movie> getCollectionList(List<link> linkList) {
        return collectionMapper.getCollectionList(linkList);
    }


}
