package patterns.adapter.exercises.implementations;

import patterns.adapter.exercises.interfaces.ThreePinPlug;
import patterns.adapter.exercises.interfaces.TwoPinPlug;

public class TwoToThreePinPlugAdaper implements TwoPinPlug {

    private ThreePinPlug threePinPlug;


    public TwoToThreePinPlugAdaper(ThreePinPlug threePinPlug) {
        this.threePinPlug = threePinPlug;
    }

    @Override
    public void turnOnTwoPinPlug() {
        this.threePinPlug.turnOnTwoThreePlug();
        System.out.println("(two with adapter)");
    }
}
