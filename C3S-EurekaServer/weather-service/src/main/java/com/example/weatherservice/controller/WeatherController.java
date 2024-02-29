package com.example.weatherservice.controller;

import com.example.weatherservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public Integer getWeather(@RequestParam String city, @RequestParam String country) {
        return weatherService.getWeather(city, country);
    }

    @GetMapping("/message")
    public String getMessage() {
        return " ";
    }

}
