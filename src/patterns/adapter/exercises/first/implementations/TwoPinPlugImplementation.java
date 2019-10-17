package patterns.adapter.exercises.first.implementations;

import patterns.adapter.exercises.first.interfaces.TwoPinPlug;

public class TwoPinPlugImplementation implements TwoPinPlug {
    @Override
    public void turnOnTwoPinPlug() {
        System.out.println("Two pin: ON");
    }
}
