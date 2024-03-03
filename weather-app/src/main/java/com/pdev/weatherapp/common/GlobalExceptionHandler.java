package com.pdev.weatherapp.common;

import com.pdev.weatherapp.exception.WeatherException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(WeatherException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestResponse<String> handleProductManagementException(WeatherException ex) {
        return new RestResponse<>(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), null);
    }
}