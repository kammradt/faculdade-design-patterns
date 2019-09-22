package patterns.factory.exercises.exercise2.factory;

import patterns.factory.exercises.exercise2.classes.abstracts.Seat;
import patterns.factory.exercises.exercise2.classes.concrete.seat.AluminiumSeat;
import patterns.factory.exercises.exercise2.classes.concrete.seat.PlasticSeat;
import patterns.factory.exercises.exercise2.classes.concrete.seat.WoodSeat;
import patterns.factory.exercises.exercise2.enums.MaterialType;

public class SeatFactory {

    public Seat createSeat(MaterialType materialType) {
        Seat seat;
        switch (materialType) {
            case WOOD:
                seat = new WoodSeat();
                break;
            case PLASTIC:
                seat = new PlasticSeat();
                break;
            case ALUMINUM:
                seat = new AluminiumSeat();
                break;
            default:
                seat = new WoodSeat();
        }
        return seat;
    }
}
