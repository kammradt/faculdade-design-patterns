package patterns.singleton.exercises;

public class Increment {
    private static Increment increment;
    private static int number;

    private Increment() { }

    public static Increment getInstance() {
        if (increment == null)
            increment = new Increment();

        number++;
        return increment;
    }

    @Override
    public String toString() {
        return "Value: " + number;
    }
}
