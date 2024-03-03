package com.pdev.weatherapp.service.impl;


import com.pdev.weatherapp.Models.Weather;
import com.pdev.weatherapp.constant.StringConstant;
import com.pdev.weatherapp.enums.RangeType;
import com.pdev.weatherapp.exception.WeatherException;
import com.pdev.weatherapp.exception.WeatherExceptions;
import com.pdev.weatherapp.service.interfaces.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final RestTemplate restTemplate;

    @Override
    public Weather getWeather(String city, String country, String range) throws WeatherException {
        validateInput(city, country, range);

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = calculateEndDate(startDate, RangeType.valueOf(range.toUpperCase()));

        String url = buildWeatherApiUrl(city, country, startDate, endDate);

        ResponseEntity<Weather> response = restTemplate.getForEntity(url, Weather.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw WeatherExceptions.RETRIEVE_FAIL;
        }
    }

    private void validateInput(String city, String country, String range) throws WeatherException {
        if (!isValidRange(range)) {
            throw WeatherExceptions.INVALID_RANGE;
        }
    }

    private LocalDate calculateEndDate(LocalDate startDate, RangeType rangeType) {
        return startDate.plusDays(rangeType.getDays() - 1);
    }

    private String buildWeatherApiUrl(String city, String country, LocalDate startDate, LocalDate endDate) {
        return String.format("%s%s,%s/%s/%s?key=%s", StringConstant.BASE_URL, city, country, startDate, endDate, StringConstant.API_KEY);
    }

    private boolean isValidRange(String range) {
        try {
            RangeType.valueOf(range.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
