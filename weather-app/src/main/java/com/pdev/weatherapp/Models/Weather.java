package com.pdev.weatherapp.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    private String resolvedAddress;
    private String address;
    private String timezone;
    private String description;
    private List<Day> days;
}
