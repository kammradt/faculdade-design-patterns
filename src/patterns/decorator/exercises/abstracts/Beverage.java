package patterns.decorator.exercises.abstracts;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract Double cost();
}
