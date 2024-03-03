package com.pdev.weatherapp.service.interfaces;

import com.pdev.weatherapp.Models.Weather;
import com.pdev.weatherapp.exception.WeatherException;

public interface WeatherService {
      Weather getWeather(String city, String country, String range) throws WeatherException;
}
