import java.awt.*;

public class RightTriangle extends Shape {
    public RightTriangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double x = Math.abs(points[0].getX() - points[1].getX());
        double y = Math.abs(points[0].getY() - points[1].getY());
        double a =  Math.sqrt(x*x + y*y);
        x =Math.abs(points[1].getX() - points[2].getX());
        y =Math.abs(points[1].getY() - points[2].getY());
        double b = Math.sqrt(x*x + y*y);
        x =Math.abs(points[2].getX() - points[0].getX());
        y =Math.abs(points[2].getY() - points[0].getY());
        double c = Math.sqrt(x*x + y*y);
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
