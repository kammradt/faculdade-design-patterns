package patterns.strategy.exercises;

import patterns.strategy.exercises.classes.*;

import static util.Util.print;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        king.setWeapon(new Sword());
        king.fight();
        king.attackWithWeapon();
        print("");

        Warrior warrior = new Warrior();
        warrior.setWeapon(new Axe());
        warrior.fight();
        warrior.attackWithWeapon();
        print("");

        Bogle bogle = new Bogle();
        bogle.setWeapon(new Sword());
        bogle.fight();
        bogle.attackWithWeapon();
        print("");

        Queen queen = new Queen();
        queen.setWeapon(new Bow());
        queen.fight();
        queen.attackWithWeapon();
        print("");
    }
}
