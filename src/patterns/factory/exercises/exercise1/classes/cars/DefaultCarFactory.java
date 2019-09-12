package patterns.factory.exercises.exercise1.classes.cars;

public class DefaultCarFactory {
    public Car createCar(String carName) {
        switch (carName) {
            case "Ferrari":
                Car ferrari = new Ferrari();
                ferrari.addAccessory("Nitro");
                ferrari.chooseColor("Red");
                ferrari.chooseFuel("The best possible");
                ferrari.mountCar();
                return ferrari;
            case "Gol":
                Car gol = new Gol();
                gol.addAccessory("New wheels");
                gol.chooseColor("Silver");
                gol.chooseFuel("Alcohol");
                gol.mountCar();
                return gol;
            default:
                throw new IllegalStateException("Unexpected value: " + carName);
        }
    }
}
