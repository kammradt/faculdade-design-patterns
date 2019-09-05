package patterns.decorator.exercises.concrete.condiments;

import patterns.decorator.exercises.abstracts.Beverage;
import patterns.decorator.exercises.abstracts.CondimentDecorator;

public class Abacaxi extends CondimentDecorator {
    private Beverage beverage;

    public Abacaxi(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s %s", beverage.getDescription(), this.getClass().getSimpleName());
    }

    @Override
    public Double cost() {
        return 1.2 + beverage.cost();
    }
}
