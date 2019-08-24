package patterns.observer.exercises.interfaces;

import patterns.observer.exercises.interfaces.Observable;
import patterns.observer.exercises.interfaces.Observer;

import java.util.ArrayList;

public class Math implements Observable {
    private float firstNumber;
    private float secondNumber;
    private ArrayList<Observer> observers;

    public Math() {
        this.observers = new ArrayList<>();
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
    public void setNumbers(float firstNumber,float secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        numbersChanged();
    }

    private void numbersChanged(){
        notifyObservers();
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers)
            observer.update(this.firstNumber, this.secondNumber);
    }
}
