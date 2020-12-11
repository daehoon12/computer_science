import java.awt.*;
import java.util.SplittableRandom;

public class RectangularShapeFactory implements ShapeFactory {
    private static RectangularShapeFactory uniqueInstance;

    public static RectangularShapeFactory getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new RectangularShapeFactory();
            return uniqueInstance;
    }

    @Override
    public Shape create(String type, Point[] points) {
        if (type.equals("Rectangle")) {
            return new Rectangle(type, points);
        }
        else if (type.equals("Trapezoid")) {
            return new Trapezoid(type, points);
        }
        else if (type.equals("Parallelogram")) {
            return new Parallelogram(type, points);
        }
        return null;
    }


}
