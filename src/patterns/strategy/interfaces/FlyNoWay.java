package patterns.strategy.interfaces;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Sorry, I can not fly");
    }
}
