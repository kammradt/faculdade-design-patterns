package patterns.strategy.interfaces;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
