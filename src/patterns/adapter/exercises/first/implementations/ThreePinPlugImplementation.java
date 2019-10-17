package patterns.adapter.exercises.first.implementations;

import patterns.adapter.exercises.first.interfaces.ThreePinPlug;

public class ThreePinPlugImplementation implements ThreePinPlug {
    @Override
    public void turnOnTwoThreePlug() {
        System.out.println("Three pin: ON");
    }
}
