package at.obe.shapes;
import at.obe.interfaces.Shape;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
