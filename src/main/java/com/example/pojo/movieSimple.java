package com.example.pojo;

import lombok.Getter;

@Getter
public class movieSimple {
    private Integer movieId;
    private String title;

    public movieSimple(Integer movieId, String title) {
        this.movieId = movieId;
        this.title = title;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
