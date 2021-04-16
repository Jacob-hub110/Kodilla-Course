package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;
public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
/** Zadanie 6.5 **/
    public double averageTemp(){
        double sum = 0;
        /*for (int i = 0; i < temperatures.length; i++) {
            sum = sum + temperatures[i];
        }
        double average = sum / temperatures.length;*/

        return 0;
    }

    public double medianTemp(){

        return 0;
    }
/** Koniec **/


    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
}
