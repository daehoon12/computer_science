import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        return (points[1].getX() - points[0].getX())
                * (points[0].getY() - points[1].getY());
    }
}
