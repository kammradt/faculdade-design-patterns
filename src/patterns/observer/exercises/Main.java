package patterns.observer.exercises;

import patterns.observer.exercises.interfaces.DivisionObserver;
import patterns.observer.exercises.interfaces.Math;
import patterns.observer.exercises.interfaces.ModuleObserver;

public class Main {
    public static void main(String[] args) {
        Math math = new Math();

        ModuleObserver moduleObserver = new ModuleObserver(math);
        DivisionObserver divisionObserver = new DivisionObserver(math);

        math.setNumbers(10, 3);
        math.setNumbers(20, 2);
        math.setNumbers(5, 3);

    }
}
