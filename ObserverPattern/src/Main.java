import Display.CurrentConditionDisplay;
import Display.StatisticDisplay;
import Subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(25, 60, 30.5f);
        weatherData.setMeasurements(30, 50, 28.4f);
        weatherData.setMeasurements(20, 80, 35.3f);
    }
}
