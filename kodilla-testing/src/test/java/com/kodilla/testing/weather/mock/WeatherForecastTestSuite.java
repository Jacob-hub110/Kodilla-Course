package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
        // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        Mockito.when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);// [10]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }

    /**
     * Zadanie 6.5
     **/
    /*@Test
    void testAverageTemp() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageValue = weatherForecast.;

        //Then
        Assertions.assertEquals(, averageValue);
    }

    @Test
    void testMedianTemp() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianValue = weatherForecast.;

        //Then
        Assertions.assertEquals(, medianValue);
    }*/

    /** Koniec **/
}
