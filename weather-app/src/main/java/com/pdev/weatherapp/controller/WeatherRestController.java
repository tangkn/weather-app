package com.pdev.weatherapp.controller;

import com.pdev.weatherapp.Models.Weather;
import com.pdev.weatherapp.common.RestResponse;
import com.pdev.weatherapp.common.RestResponseUtils;
import com.pdev.weatherapp.exception.WeatherException;
import com.pdev.weatherapp.service.impl.WeatherServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/portal/weather")
@AllArgsConstructor
public class WeatherRestController {

    private WeatherServiceImpl weatherServiceImpl;


    @GetMapping("/{city},{countryCode}/{range}")
    public RestResponse<Weather> getWeather(
            @PathVariable String city,
            @PathVariable String countryCode,
            @PathVariable String range
    ) throws WeatherException {
        return RestResponseUtils.success(weatherServiceImpl.getWeather(city, countryCode, range));
    }

}
