package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class film {
    private Integer filmId;
    private String director;
    private String detail;
    private String player;
    private String img;
    private String filmName;
}
