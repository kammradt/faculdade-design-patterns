package patterns.composite.exercises.classes;

import patterns.composite.exercises.interfaces.GraphicObject;

public class Circle implements GraphicObject {
    @Override
    public void draw() {
        System.out.println("Drawing a circle!");
    }
}
