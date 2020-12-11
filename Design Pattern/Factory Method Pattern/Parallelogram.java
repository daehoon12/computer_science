import java.awt.*;

public class Parallelogram extends Shape {
    public Parallelogram(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double width = 0;
        double height = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].getY() == points[j].getY()) {
                    width = Math.max(width, Math.abs(points[j].getX() - points[i].getX()));
                }
            }
        }
        height= Math.abs(points[1].getY() - points[0].getY());
        return width*height;
    }
}
