package patterns.decorator.exercises.concrete.beverages;

import patterns.decorator.exercises.abstracts.Beverage;

public class Caipira extends Beverage {

    public Caipira() {
        this.description = this.getClass().getSimpleName() + " w/";
    }

    @Override
    public Double cost() {
        return 3.;
    }
}
