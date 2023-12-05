package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class movie {
    private Integer movieId;
    private String title;
    private String director;
    private String writer;
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
