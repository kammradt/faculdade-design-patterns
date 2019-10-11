package patterns.composite.exercises.classes;

import patterns.composite.exercises.interfaces.GraphicObject;

public class Line implements GraphicObject {
    @Override
    public void draw() {
        System.out.println("Drawing a line!");
    }
}
