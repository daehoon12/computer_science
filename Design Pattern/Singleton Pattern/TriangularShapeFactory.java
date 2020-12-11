import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory {
    private static TriangularShapeFactory uniqueInstance;
    public static TriangularShapeFactory getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new TriangularShapeFactory();
        }
        return uniqueInstance;
    }

    @Override
    public Shape create(String type, Point[] points) {
        if (type.equals("Triangle")) {
            return new Triangle(type, points);
        }
        else if (type.equals("RightTriangle")) {
            return new RightTriangle(type, points);
        }
        return null;
    }
}
