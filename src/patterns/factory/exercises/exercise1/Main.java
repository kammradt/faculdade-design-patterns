package patterns.factory.exercises.exercise1;

import patterns.factory.exercises.exercise1.classes.stores.Store;
import patterns.factory.exercises.exercise1.classes.stores.StoreOne;

public class Main {
    public static void main(String[] args) {
        Store storeNumberOne = new StoreOne();
        storeNumberOne.askForCar("Ferrari");
        storeNumberOne.askForCar("Gol");

    }
}
