package patterns.composite.exercises.first.classes;

import patterns.composite.exercises.first.interfaces.GraphicObject;

public class Circle implements GraphicObject {
    @Override
    public void draw() {
        System.out.println("Drawing a circle!");
    }
}
