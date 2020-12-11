import java.awt.*;

public class Triangle extends Shape {
    Triangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double a = distance(points[0], points[1]);
        double b = distance(points[1], points[2]);
        double c = distance(points[0], points[2]);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private double distance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
