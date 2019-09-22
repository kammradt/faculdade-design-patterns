package patterns.factory.exercises.exercise2.factory;

import patterns.factory.exercises.exercise2.classes.abstracts.Structure;
import patterns.factory.exercises.exercise2.classes.concrete.structure.AluminiumStructure;
import patterns.factory.exercises.exercise2.classes.concrete.structure.PlasticStructure;
import patterns.factory.exercises.exercise2.classes.concrete.structure.WoodStructure;
import patterns.factory.exercises.exercise2.enums.MaterialType;

public class StructureFactory {

    public Structure createStructure(MaterialType materialType) {
        Structure structure;
        switch (materialType) {
            case WOOD:
                structure = new WoodStructure();
                break;
            case PLASTIC:
                structure = new PlasticStructure();
                break;
            case ALUMINUM:
                structure = new AluminiumStructure();
                break;
            default:
                structure = new WoodStructure();
        }
        return structure;
    }
}
