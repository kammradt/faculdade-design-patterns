package patterns.adapter.exercises.implementations;

import patterns.adapter.exercises.interfaces.TwoPinPlug;

public class TwoPinPlugImplementation implements TwoPinPlug {
    @Override
    public void turnOnTwoPinPlug() {
        System.out.println("Two pin: ON");
    }
}
