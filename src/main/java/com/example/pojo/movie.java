package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class movie {
    @Getter
    private Integer movieId;
    @Getter
    private String title;
    private String img;
    private String director;
    private String writer;

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String actor;
    private String type;
    private String country;
    private String language;
    private String releaseYear;
    private String time;
    private String bename;
    private String imdb;
    private String rating;
    private String ratingNumber;

}
