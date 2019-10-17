package patterns.adapter.exercises.second.implementations;

import patterns.adapter.exercises.second.interfaces.WantedAdder;

public class Client {
    private WantedAdder adder;

    public Client(WantedAdder adder) {
        this.adder = adder;
    }

    public void execute() {
        int[] vector = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = this.adder.sumVector(vector);
        System.out.println("Result: " + sum);
    }
}
