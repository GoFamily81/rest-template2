package com.example.resttemplate2.mapper;

import com.example.resttemplate2.dto.ShortWeather;
import com.example.resttemplate2.dto.WeatherDto;

public class ShortWeatherMapper {
    public static ShortWeather getShortWeather(WeatherDto weatherDto, ShortWeather weather) {
        weather.setCountry(weatherDto.getSys().getCountry());
        weather.setCity(weatherDto.getName());
        weather.setTemp(weatherDto.getMain().getTemp() - 273.15);
        weather.setSpeed(weatherDto.getWind().getSpeed());
        return weather;
    }
}
