package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {
    public TemperaturesStub() {
    }

    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap();
        stubResult.put("Rzeszow", 25.5D);
        stubResult.put("Krakow", 26.2D);
        stubResult.put("Wroclaw", 24.8D);
        stubResult.put("Warszawa", 25.2D);
        stubResult.put("Gdansk", 26.1D);
        return stubResult;
    }
}
