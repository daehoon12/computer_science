import java.awt.*;

public class Parallelogram extends Shape {
    public Parallelogram(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        return (points[1].getX() - points[2].getX())
                * (points[0].getY() - points[2].getY());
    }
}
