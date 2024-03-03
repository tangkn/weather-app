package com.pdev.weatherapp.exception;

public class WeatherException extends Exception {

    private int exceptionCode;

    protected WeatherException(int exceptionCode, String message) {
        super(message);
        this.exceptionCode=exceptionCode;
    }
    public int getExceptionCode(){
        return exceptionCode;
    }
}
