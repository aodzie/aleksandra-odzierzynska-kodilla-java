package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WeatherForecast<median> {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap();
        Iterator var2 = this.temperatures.getTemperatures().entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, Double> temperature = (Entry)var2.next();
            resultMap.put((String)temperature.getKey(), (Double)temperature.getValue() + 1.0D);
        }

        return resultMap;
    }

    public Double averageTemperature() {
        Double sum = 0.0D;
        int i = 0;
        Double result = 0.0D;

        for(Iterator var4 = this.temperatures.getTemperatures().entrySet().iterator(); var4.hasNext(); ++i) {
            Entry<String, Double> temperature = (Entry)var4.next();
            sum = (Double)temperature.getValue() + sum;
        }

        result = sum / (double)i;
        return result;
    }

    public Double medianTemperature() {
        Double median = 0.0D;
        List<Double> sortedTemperatures = new ArrayList();
        Iterator var3 = this.temperatures.getTemperatures().entrySet().iterator();

        while(var3.hasNext()) {
            Entry<String, Double> temperature = (Entry)var3.next();
            sortedTemperatures.add((Double)temperature.getValue());
        }

        Collections.sort(sortedTemperatures);
        int n = sortedTemperatures.size() / 2;
        if (sortedTemperatures.size() % 2 == 0) {
            median = (Double)sortedTemperatures.get(n) + (Double)sortedTemperatures.get(n + 1) / 2.0D;
        } else {
            median = (Double)sortedTemperatures.get(n);
        }

        return median;
    }
}
