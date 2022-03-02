package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeatherForecastTestSuite {
    WeatherForecastTestSuite() {
    }

    @Test
    void testCalculateForecastWithStub() {
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
