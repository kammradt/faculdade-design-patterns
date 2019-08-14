package patterns.strategy;

import patterns.strategy.classes.DecoyDuck;
import patterns.strategy.classes.MallarDuck;
import patterns.strategy.classes.RedheadDuck;
import patterns.strategy.classes.RubberDuck;
import patterns.strategy.interfaces.*;

import static util.Util.print;

public class Main {
    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.setFlyBehavior(new FlyWithWings());
        decoyDuck.setQuackBehavior(new RegularQuack());
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        print("");

        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.setFlyBehavior(new FlyWithWings());
        mallarDuck.setQuackBehavior(new Squeak());
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        print("");

        RedheadDuck redheadDuck= new RedheadDuck();
        redheadDuck.setFlyBehavior(new FlyNoWay());
        redheadDuck.setQuackBehavior(new MuteQuack());
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        print("");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new RegularQuack());
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        print("");
    }
}
