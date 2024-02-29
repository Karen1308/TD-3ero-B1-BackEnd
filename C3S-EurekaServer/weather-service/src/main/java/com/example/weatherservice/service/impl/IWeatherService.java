package com.example.weatherservice.service.impl;

import com.example.weatherservice.service.WeatherService;
import org.springframework.stereotype.Service;

@Service
public class IWeatherService implements WeatherService {
    @Override
    public Integer getWeather(String city, String country) {
        return 25;
    }
}
