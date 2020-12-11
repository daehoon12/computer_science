import java.awt.*;

public class Trapezoid extends Shape {
    public Trapezoid(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double uWidth = points[3].getX() - points[0].getX();
        double bWidth = points[1].getX() - points[2].getX();
        double height = points[0].getY() - points[2].getY();
        return (uWidth + bWidth) * height / 2;
    }
}
