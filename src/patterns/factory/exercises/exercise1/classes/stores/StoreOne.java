package patterns.factory.exercises.exercise1.classes.stores;

import patterns.factory.exercises.exercise1.classes.cars.Car;
import patterns.factory.exercises.exercise1.classes.cars.DefaultCarFactory;

public class StoreOne extends Store {


    @Override
    public Car askForCar(String carName) {
        System.out.println("StoreOne logic goes here before Factory . . ");
        DefaultCarFactory defaultCarFactory = new DefaultCarFactory();
        return defaultCarFactory.createCar(carName);
    }
}
