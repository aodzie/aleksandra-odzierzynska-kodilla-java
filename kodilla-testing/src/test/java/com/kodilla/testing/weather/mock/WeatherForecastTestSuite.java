package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    WeatherForecastTestSuite() {
    }

    @Test
    void testCalculateForecastWithMock() {
        Map<String, Double> temperaturesMap = new HashMap();
        temperaturesMap.put("Rzeszow", 25.5D);
        temperaturesMap.put("Krakow", 26.2D);
        temperaturesMap.put("Wroclaw", 24.8D);
        temperaturesMap.put("Warszawa", 25.2D);
        temperaturesMap.put("Gdansk", 26.1D);
        Mockito.when(this.temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature() {
        Map<String, Double> temperaturesMap = new HashMap();
        temperaturesMap.put("Rzeszow", 25.5D);
        temperaturesMap.put("Krakow", 26.2D);
        temperaturesMap.put("Wroclaw", 24.8D);
        temperaturesMap.put("Warszawa", 25.2D);
        temperaturesMap.put("Gdansk", 26.1D);
        Mockito.when(this.temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);
        Double averageTemp = weatherForecast.averageTemperature();
        Assertions.assertEquals(25.56D, averageTemp);
    }

    @Test
    void testMedianTemperature() {
        Map<String, Double> temperaturesMap = new HashMap();
        temperaturesMap.put("Rzeszow", 25.5D);
        temperaturesMap.put("Krakow", 26.2D);
        temperaturesMap.put("Wroclaw", 24.8D);
        temperaturesMap.put("Warszawa", 25.2D);
        temperaturesMap.put("Gdansk", 26.1D);
        Mockito.when(this.temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(this.temperaturesMock);
        Double medianTemp = weatherForecast.medianTemperature();
        Assertions.assertEquals(25.5D, medianTemp);
    }
}
