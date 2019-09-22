package patterns.factory.exercises.exercise2.factory;

import patterns.factory.exercises.exercise2.classes.abstracts.Back;
import patterns.factory.exercises.exercise2.classes.concrete.back.AluminiumBack;
import patterns.factory.exercises.exercise2.classes.concrete.back.PlasticBack;
import patterns.factory.exercises.exercise2.classes.concrete.back.WoodBack;
import patterns.factory.exercises.exercise2.enums.MaterialType;

public class BackFactory {

    public Back createBack(MaterialType materialType) {
        Back back;
        switch (materialType) {
            case WOOD:
                back = new WoodBack();
                break;
            case PLASTIC:
                back = new PlasticBack();
                break;
            case ALUMINUM:
                back = new AluminiumBack();
                break;
            default:
                back = new WoodBack();
        }
        return back;
    }
}
