package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.link;
import com.example.pojo.movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.collectionService;

import java.util.List;

@Slf4j
@RestController
public class collectionController {
    @Autowired
    private collectionService collectionService;



    //添加收藏
    @PostMapping("/addCollection")
        public Result addCollection(@RequestBody link link) {

        log.info("添加收藏：{}",link);
        collectionService.addCollection(link);

        return Result.success();
    }

    //删除收藏
    @PostMapping("/deleteCollection")
        public Result deleteCollection(@RequestBody link link) {
        log.info("删除收藏：{}",link);
        collectionService.deleteCollection(link);
        return Result.success();
    }

    //获取收藏的电影列表
    @PostMapping("/getCollection")
        public Result getCollection(@RequestBody link link) {

        Integer userId = link.getUserId();

        log.info("获取用户的收藏关系列表：{}",userId);
        List <link> linkList = collectionService.getLinkList(userId);
        log.info("获取收藏的电影列表：{}",linkList);

//        List <movie> collectionMovieList = collectionService.getCollectionList(linkList);

//        return Result.success(collectionMovieList);
        return Result.success(linkList);//已成功拿到相关的收藏关系列表
    }

}
