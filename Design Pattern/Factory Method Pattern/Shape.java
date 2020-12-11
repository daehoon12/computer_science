import java.awt.Point;

// points는 Shape을 상속하는 클래스들에서 면적 계산할 때 써야 해서 일부러 package default로 만들었습니다.
// protected로 설정해도 마찬가지 일테고, private으로 만든 후에 get() 함수를 만드는 것도 방법이겠지만, 편의상
// 이렇게 지정했습니다.
public abstract class Shape {
    String type;
    Point[] points;

    public Shape(String type, Point[] points) {
        this.type = type;
        this.points = points;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        String s = type + "\n";
        for (int i = 0; i < points.length; i++) {
            s += ("P" + i + ": ");
            s += (points[i] + "\n");
        }
        s += "area: " + calcArea() + "\n";
        return s;
    }
}
