package patterns.adapter.exercises.implementations;

import patterns.adapter.exercises.interfaces.ThreePinPlug;

public class ThreePinPlugImplementation implements ThreePinPlug {
    @Override
    public void turnOnTwoThreePlug() {
        System.out.println("Three pin: ON");
    }
}
