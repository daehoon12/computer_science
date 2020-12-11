import java.awt.*;

public class Trapezoid extends Shape {
    public Trapezoid(String type, Point[] points) {
        super(type, points);
    }

    @Override
    public double calcArea() {
        double min_width = 987654321;
        double max_width =0;
        double height = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].getY() == points[j].getY()) {
                    max_width = Math.max(max_width, Math.abs(points[j].getX() - points[i].getX()));
                    min_width = Math.min(min_width, Math.abs(points[j].getX() - points[i].getX()));
                }
                else
                    height= Math.abs(points[1].getY() - points[0].getY());
            }
        }

        return (max_width + min_width)*height/2;
    }
}
