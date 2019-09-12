package patterns.factory.exercises.exercise1.classes.cars;

public abstract class Car {
    abstract void addAccessory(String accessoryName);

    abstract void chooseFuel(String fuelName);

    abstract void chooseColor(String colorName);

    void mountCar() {
        System.out.println("Mounting . . . \n\n");
    }
}
