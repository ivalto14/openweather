package com.example.weather;

import com.intuit.karate.junit5.Karate;

public class WeatherTest {

    @Karate.Test
    Karate testWeather() {
        return Karate.run("Weather").relativeTo(getClass());
    }
}



