package patterns.observer.classes;

import patterns.observer.interfaces.Display;
import patterns.observer.interfaces.Observer;

public class PressureDisplay implements Display, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public PressureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("----------------------------------------------------\n");
        System.out.print("Forecast about Pressure: ");
        if (this.currentPressure > this.lastPressure)
            System.out.println("Improving weather on the way!");
        else if (this.currentPressure == this.lastPressure)
            System.out.println("More of the same");
        else if (this.currentPressure < this.lastPressure)
            System.out.println("Watch out for cooler, rainy weather");
        System.out.println("----------------------------------------------------\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = currentPressure;
        this.currentPressure = pressure;
        display();
    }
}
