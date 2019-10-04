package patterns.factory.exercises.exercise2.classes.abstracts;

import patterns.factory.exercises.exercise2.enums.MaterialType;
import patterns.factory.exercises.exercise2.factory.ArmFactory;
import patterns.factory.exercises.exercise2.factory.BackFactory;
import patterns.factory.exercises.exercise2.factory.SeatFactory;
import patterns.factory.exercises.exercise2.factory.StructureFactory;

public abstract class Chair {
    private Seat seat;
    private Arm arm;
    private Back back;
    private Structure structure;

    public void createAndSetSeat(MaterialType materialType) {
        SeatFactory seatFactory = new SeatFactory();
        this.seat = seatFactory.createSeat(materialType);
    }

    public void createAndSetArm(MaterialType materialType) {
        ArmFactory armFactory = new ArmFactory();
        this.arm = armFactory.createArm(materialType);
    }

    public void createAndSetBack(MaterialType materialType) {
        BackFactory backFactory = new BackFactory();
        this.back = backFactory.createBack(materialType);
    }

    public void createAndSetStructure(MaterialType materialType) {
        StructureFactory structureFactory = new StructureFactory();
        this.structure = structureFactory.createStructure(materialType);
    }

}
