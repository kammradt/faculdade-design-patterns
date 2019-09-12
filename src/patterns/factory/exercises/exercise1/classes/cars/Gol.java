package patterns.factory.exercises.exercise1.classes.cars;

public class Gol extends Car {
    @Override
    void addAccessory(String accessoryName) {
        System.out.printf("Adding %s to humble gol.%n", accessoryName);
    }

    @Override
    void chooseFuel(String fuelName) {
        System.out.printf("Choosing %s to my gol.%n", fuelName);
    }

    @Override
    void chooseColor(String colorName) {
        System.out.printf("Choosing the best color for my gol: %s.%n", colorName);
    }
}
