package patterns.observer.classes;

import patterns.observer.interfaces.Display;
import patterns.observer.interfaces.Observer;

public class TemperatureDisplay implements Display, Observer {
    private float minimumTemperature = 0.0f;
    private float maximumTemperature = 200f;
    private float sumOfTemperatures  = 0.0f;
    private int numberOfReadings = 0;
    private WeatherData weatherData;

    public TemperatureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avg/Max/Min temperature => ")
                .append(this.sumOfTemperatures / this.numberOfReadings).append("|")
                .append(this.maximumTemperature).append("|")
                .append(this.minimumTemperature).append("\n");
        System.out.println(sb.toString());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.sumOfTemperatures += temperature;
        this.numberOfReadings++;

        if (temperature > this.maximumTemperature)
            maximumTemperature = temperature;

        if (temperature < minimumTemperature)
            minimumTemperature = temperature;

        display();
    }
}
