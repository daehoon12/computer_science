import java.awt.Point;

public interface ShapeFactory {
    Shape create(String type, Point[] points);
}
