package patterns.adapter.exercises.first;

import patterns.adapter.exercises.first.implementations.ThreePinPlugImplementation;
import patterns.adapter.exercises.first.implementations.TwoPinPlugImplementation;
import patterns.adapter.exercises.first.implementations.TwoToThreePinPlugAdaper;
import patterns.adapter.exercises.first.interfaces.ThreePinPlug;
import patterns.adapter.exercises.first.interfaces.TwoPinPlug;

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
