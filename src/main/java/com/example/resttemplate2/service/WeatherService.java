package com.example.resttemplate2.service;

import com.example.resttemplate2.dto.ShortWeather;
import com.example.resttemplate2.dto.WeatherDto;

public interface WeatherService {
    WeatherDto getWeatherDto();

    ShortWeather getShortWeather();
}
