package patterns.composite.exercises.first.classes;

import patterns.composite.exercises.first.interfaces.GraphicObject;

public class Rectangle implements GraphicObject {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle!");
    }
}
