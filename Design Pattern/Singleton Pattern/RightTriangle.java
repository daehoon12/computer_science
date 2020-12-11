import java.awt.*;

public class RightTriangle extends Shape {
    RightTriangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        return (points[2].getX() - points[1].getX())
                * (points[0].getY() - points[2].getY()) / 2;
    }
}
