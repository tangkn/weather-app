package com.pdev.weatherapp.common;

import org.springframework.http.HttpStatus;

public class RestResponseUtils {
    public static <T> RestResponse<T> success(T data) {
        return new RestResponse<>(HttpStatus.OK.value(), "Success",data);
    }

    public static <T> RestResponse<T> error(String errorMessage, T data) {
        return new RestResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage, data);
    }

    public static RestResponse<String> error(String errorMessage) {
        return new RestResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage, null);
    }
}
