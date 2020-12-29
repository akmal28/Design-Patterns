import Displays.CurrentConditionsDisplay;
import Displays.StatisticDisplay;
import Subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(25, 70, 40.5f);
        weatherData.setMeasurements(20, 50, 38.2f);

        weatherData.deleteObserver(statisticDisplay);

        weatherData.setMeasurements(18, 40, 30.2f);


    }
}
