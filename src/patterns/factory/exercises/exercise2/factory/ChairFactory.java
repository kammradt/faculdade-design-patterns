package patterns.factory.exercises.exercise2.factory;

import patterns.factory.exercises.exercise2.classes.abstracts.Chair;
import patterns.factory.exercises.exercise2.classes.concrete.chair.AluminiumChair;
import patterns.factory.exercises.exercise2.classes.concrete.chair.PlasticChair;
import patterns.factory.exercises.exercise2.classes.concrete.chair.WoodChair;
import patterns.factory.exercises.exercise2.enums.MaterialType;

public class ChairFactory {

    public Chair createChair(MaterialType materialType) {
        Chair chair;
        switch (materialType) {
            case WOOD:
                chair = new WoodChair();
                break;
            case PLASTIC:
                chair = new PlasticChair();
                break;
            case ALUMINUM:
                chair = new AluminiumChair();
                break;
            default:
                chair = new WoodChair();
        }
        return chair;
    }
}
