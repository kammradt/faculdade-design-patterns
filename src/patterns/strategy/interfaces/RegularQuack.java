package patterns.strategy.interfaces;

public class RegularQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Just a regular quack");
    }
}
