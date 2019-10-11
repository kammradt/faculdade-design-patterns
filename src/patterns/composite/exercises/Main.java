package patterns.composite.exercises;

import patterns.composite.exercises.classes.Circle;
import patterns.composite.exercises.classes.ComplexGraphicObject;
import patterns.composite.exercises.classes.Line;
import patterns.composite.exercises.classes.Rectangle;

public class Main {
    public static void main(String[] args) {
        ComplexGraphicObject primary = new ComplexGraphicObject();
        primary.addGraphic(new Line());
        primary.addGraphic(new Line());
        primary.addGraphic(new Circle());

        ComplexGraphicObject secondary = new ComplexGraphicObject();
        secondary.addGraphic(new Rectangle());

        primary.addGraphic(secondary);

        primary.draw();
    }
}
