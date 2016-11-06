package JavaOOP.Lesson2.mutability.immutable;

/**
 * Immutable point
 * @author Bohdan Vanchuhov
 */
public class Point {
    public final double x;
    public final double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(x).append(", ").append(y).append(")");
        return sb.toString();
    }

    public Point setX(double x) {
        return new Point(x, this.y);
    }

    public Point setY(double y) {
        return new Point(this.x, y);
    }
}

class PointRunner {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("p1 = " + p1); // (0.0, 0.0)

        Point p2 = p1;
        p2.setX(10.);
        System.out.println("p1 = " + p1);
    }
}
