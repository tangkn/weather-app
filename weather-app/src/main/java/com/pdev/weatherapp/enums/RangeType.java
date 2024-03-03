package com.pdev.weatherapp.enums;

import lombok.Getter;


@Getter
public enum RangeType {

        DAILY(1),
        WEEKLY(7),
        MONTHLY(30);

        private final int days;

        RangeType(int days) {
            this.days = days;
        }


}
