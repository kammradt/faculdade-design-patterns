package patterns.observer.classes;

import patterns.observer.interfaces.Observable;
import patterns.observer.interfaces.Observer;

import java.util.ArrayList;

public class WeatherData implements Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!this.observers.remove(observer))
            System.out.println("Observer not registered. Cannot remove.");
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    private void measurementChanged(){
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
