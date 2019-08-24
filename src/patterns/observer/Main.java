package patterns.observer;

import patterns.observer.classes.PressureDisplay;
import patterns.observer.classes.TempHumiDisplay;
import patterns.observer.classes.TemperatureDisplay;
import patterns.observer.classes.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TempHumiDisplay tempHumiDisplay = new TempHumiDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);

        weatherData.setMeasurements(1,3,3);
        weatherData.setMeasurements(300,3,3);
        weatherData.setMeasurements(-3,3,3);

    }
}
