package com.example.service.impl;

import com.example.pojo.film;
import com.example.service.filmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mapper.filmMapper;
import java.util.List;


@Service
public class filmServicelmpl implements filmService {
    @Autowired
    private filmMapper filmMapper;


    //查询所有的电影数据
    @Override
    public List<film> getAllFilmList() {
        return  filmMapper.AllFilmList();
    }
}
