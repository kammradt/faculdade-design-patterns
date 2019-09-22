package patterns.factory.exercises.exercise2.factory;

import patterns.factory.exercises.exercise2.classes.abstracts.Arm;
import patterns.factory.exercises.exercise2.classes.concrete.arm.AluminiumArm;
import patterns.factory.exercises.exercise2.classes.concrete.arm.PlasticArm;
import patterns.factory.exercises.exercise2.classes.concrete.arm.WoodArm;
import patterns.factory.exercises.exercise2.enums.MaterialType;

public class ArmFactory {

    public Arm createArm(MaterialType materialType) {
        Arm arm;
        switch (materialType) {
            case WOOD:
                arm = new WoodArm();
                break;
            case PLASTIC:
                arm = new PlasticArm();
                break;
            case ALUMINUM:
                arm = new AluminiumArm();
                break;
            default:
                arm = new WoodArm();
        }
        return arm;
    }
}
