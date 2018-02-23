package observer.advanced.model;

import observer.advanced.model.base.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bifenglin
 * @date 2018/2/5 11:12
 */
public class CurrentCOnditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentCOnditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }
}
