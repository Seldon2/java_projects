package at.obe.shapes;

import at.obe.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
