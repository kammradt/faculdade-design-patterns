package patterns.observer.classes;

import patterns.observer.interfaces.Display;
import patterns.observer.interfaces.Observer;

public class TempHumiDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public TempHumiDisplay(WeatherData weatherData) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------\n");
        sb.append("Temperature: ").append(this.temperature).append("\n");
        sb.append("Humidity: ").append(this.humidity).append("\n");
        sb.append("----------------------------------------------------\n");
        System.out.println(sb.toString());
    }
}
