package observer.original.model;

import observer.original.model.base.DisplayElement;
import observer.original.model.base.Observer;
import observer.original.model.base.Subject;

/**
 * @author bifenglin
 * @date 2018/2/2 17:28
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and" + humidity + "% humidity");
    }

}
