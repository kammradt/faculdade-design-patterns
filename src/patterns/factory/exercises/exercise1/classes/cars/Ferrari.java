package patterns.factory.exercises.exercise1.classes.cars;

public class Ferrari extends Car {
    @Override
    void addAccessory(String accessoryName) {
        System.out.printf("Adding %s to Ferrari.%n", accessoryName);
    }

    @Override
    void chooseFuel(String fuelName) {
        System.out.printf("Choosing %s to Ferrari.%n", fuelName);
    }

    @Override
    void chooseColor(String colorName) {
        System.out.printf("Choosing the color for my Ferrari: %s.%n", colorName);
    }
}
