package com.pdev.weatherapp.common;

public record RestResponse<T>(int status, String message, T payload) {
}
