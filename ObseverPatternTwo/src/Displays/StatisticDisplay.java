package Displays;

import Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Statistic display: %.1f %.1f %.1f%n", this.temperature, this.humidity, this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
