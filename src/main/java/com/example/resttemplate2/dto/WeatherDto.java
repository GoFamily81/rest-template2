package com.example.resttemplate2.dto;

import com.example.resttemplate2.rest.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    private Coord coord;
    private List<Weather> weathers;
    private String base;
    private MainW main;
    private Sys sys;
    private Wind wind;
    private Integer visibility;
    private Clouds clouds;
    private Integer dt;
    private Integer id;
    private String name;
    private Integer cod;
}
