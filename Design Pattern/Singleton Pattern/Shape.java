import java.awt.Point;

public abstract class Shape {
    protected Point[] points;
    String type;

    public Shape(String type, Point[] points) {
        this.type = type;
        this.points = points;
    }

    @Override
    public String toString() {
        String s = type + "\n";
        for (int i = 0; i < points.length; i++) {
            s += ("P" + i + ": " + points[i] + "\n");
        }
        s += "area: " + calcArea() + "\n";
        return s;
    }

    public abstract double calcArea();
}
