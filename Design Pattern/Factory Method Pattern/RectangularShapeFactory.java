import java.awt.*;

public class RectangularShapeFactory implements ShapeFactory {
    Shape shape;

    @Override
    public Shape create(String type, Point[] points) {
        if(type.equals("Rectangle")){
            shape = new Rectangle("Rectangle", points);
        }
        else if(type.equals("Trapezoid")){
            shape = new Trapezoid("Trapezoid", points);
        }
        else if(type.equals("Parallelogram")){
            shape = new Parallelogram("Parallelogram", points);
        }
        return shape;
    }
}
