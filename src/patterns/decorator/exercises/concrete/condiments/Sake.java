package patterns.decorator.exercises.concrete.condiments;

import patterns.decorator.exercises.abstracts.Beverage;
import patterns.decorator.exercises.abstracts.CondimentDecorator;

public class Sake extends CondimentDecorator {
    private Beverage beverage;

    public Sake(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s %s", beverage.getDescription(), this.getClass().getSimpleName());
    }

    @Override
    public Double cost() {
        return 2.7 + beverage.cost();
    }
}
