package patterns.strategy.exercises.classes;

import patterns.strategy.exercises.interfaces.Weapon;

import static util.Util.print;

public class Sword implements Weapon {
    @Override
    public void useWeapon() {
        print("Using a sword");
    }
}
