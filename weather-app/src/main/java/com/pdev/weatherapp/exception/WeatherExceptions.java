package com.pdev.weatherapp.exception;

public interface WeatherExceptions {

    WeatherException WEATHER_INFO_NOT_FOUND = new WeatherException(1000, "Weather info not found.!");
    WeatherException RETRIEVE_FAIL = new WeatherException(1001, "Failed to retrieve weather information.!");
    WeatherException INVALID_RANGE = new WeatherException(1002, "Invalid range parameter.!");
    WeatherException INVALID_INPUT = new WeatherException(1003, "Invalid input.!");
    WeatherException INVALID_COUNTRY_CODE = new WeatherException(1004, "Invalid country code.!");


}
