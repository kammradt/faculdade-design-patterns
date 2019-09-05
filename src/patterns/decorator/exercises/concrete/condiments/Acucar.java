package patterns.decorator.exercises.concrete.condiments;

import patterns.decorator.exercises.abstracts.Beverage;
import patterns.decorator.exercises.abstracts.CondimentDecorator;

public class Acucar extends CondimentDecorator {
    private Beverage beverage;

    public Acucar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s %s", beverage.getDescription(), this.getClass().getSimpleName());
    }

    @Override
    public Double cost() {
        return 1. + beverage.cost();
    }
}
