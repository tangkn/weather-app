package com.pdev.weatherapp.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Day {
    private String datetime;
    private float temp;
    private float feelsLike;
    private float humidity;
    private float snow;
    private float windSpeed;
    private float windDir;
    private float pressure;
    private float cloudCover;
    private float visibility;
    private String sunrise;
    private String sunset;
    private float moonPhase;
    private String conditions;
    private String description;
}
