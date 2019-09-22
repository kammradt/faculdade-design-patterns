package patterns.factory.exercises.exercise2;


import patterns.factory.exercises.exercise2.classes.abstracts.Chair;
import patterns.factory.exercises.exercise2.enums.MaterialType;
import patterns.factory.exercises.exercise2.factory.ChairFactory;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Chair chair = chairFactory.createChair(MaterialType.WOOD);
        chair.createAndSetArm(MaterialType.WOOD);
        chair.createAndSetBack(MaterialType.PLASTIC);
        chair.createAndSetSeat(MaterialType.ALUMINUM);
        chair.createAndSetStructure(MaterialType.WOOD);
    }
}
