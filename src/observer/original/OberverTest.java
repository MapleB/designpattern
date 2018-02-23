package observer.original;

import observer.original.model.CurrentConditionDisplay;
import observer.original.model.WeatherData;

/**
 * @author bifenglin
 * @date 2018/2/2 17:13
 */
public class OberverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
