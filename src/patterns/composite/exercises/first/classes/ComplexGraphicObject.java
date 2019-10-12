package patterns.composite.exercises.first.classes;

import patterns.composite.exercises.first.interfaces.GraphicObject;

import java.util.ArrayList;
import java.util.List;

public class ComplexGraphicObject implements GraphicObject {
    private List<GraphicObject> graphics;

    public ComplexGraphicObject() {
        this.graphics = new ArrayList<GraphicObject>();
    }

    @Override
    public void draw() {
        System.out.println("I'm a complex object: " + this.hashCode());
        this.graphics.forEach(GraphicObject::draw);
        System.out.println("I'm a complex object finished: " + this.hashCode());

    }

    public void addGraphic(GraphicObject graphicObject) {
        this.graphics.add(graphicObject);
    }

    public void removeGraphic(GraphicObject graphicObject) {
        this.graphics.remove(graphicObject);
    }
}
