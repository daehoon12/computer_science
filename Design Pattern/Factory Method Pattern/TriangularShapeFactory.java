import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory {
    Shape shape;
    @Override
    public Shape create(String type, Point[] points) {
        if(type.equals("Triangle")){
            shape = new Triangle("Triangle", points);
        }
        else if(type.equals("RightTriangle")){
            shape = new RightTriangle("RightTriangle", points);
        }

        return shape;
    }
}
