package patterns.adapter.exercises;

import patterns.adapter.exercises.implementations.ThreePinPlugImplementation;
import patterns.adapter.exercises.implementations.TwoPinPlugImplementation;
import patterns.adapter.exercises.implementations.TwoToThreePinPlugAdaper;
import patterns.adapter.exercises.interfaces.ThreePinPlug;
import patterns.adapter.exercises.interfaces.TwoPinPlug;

public class Client {
    public static void main(String[] args) {
        ThreePinPlug three = new ThreePinPlugImplementation();
        three.turnOnTwoThreePlug();
        System.out.println("\n");

        TwoPinPlug two = new TwoPinPlugImplementation();
        two.turnOnTwoPinPlug();
        System.out.println("\n");

        TwoPinPlug adapter = new TwoToThreePinPlugAdaper(three);
        adapter.turnOnTwoPinPlug();
    }
}
