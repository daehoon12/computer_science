import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double width = 0;
        double height = 0;
        width = Math.abs(points[1].getX() - points[0].getX());
        height= Math.abs(points[1].getY() - points[0].getY());
        return width*height;
    }
}
