package patterns.strategy.exercises.classes;

import patterns.strategy.exercises.interfaces.Weapon;

public abstract class Character {
    private Weapon weapon;

    public abstract void fight();

    public void attackWithWeapon() {
        this.weapon.useWeapon();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
