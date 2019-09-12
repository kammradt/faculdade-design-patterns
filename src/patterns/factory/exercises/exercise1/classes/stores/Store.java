package patterns.factory.exercises.exercise1.classes.stores;

import patterns.factory.exercises.exercise1.classes.cars.Car;

public abstract class Store {
    private String sellerName = this.getClass().getSimpleName();

    public abstract Car askForCar(String carName);

    private String getSellerName() {
        return this.sellerName;
    }

    @Override
    public String toString() {
        return getSellerName();
    }
}
