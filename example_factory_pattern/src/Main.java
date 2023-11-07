import at.obe.shapes.ShapeFactory;
import at.obe.interfaces.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("Circle");
        circle.draw();

        Shape rectangle = factory.createShape("Rectangle");
        rectangle.draw();
    }
}