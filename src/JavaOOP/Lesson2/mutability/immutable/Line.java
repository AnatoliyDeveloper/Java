package JavaOOP.Lesson2.mutability.immutable;

/**
 * @author Bohdan Vanchuhov
 */
public class Line {
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "[" + pointA + ", " + pointB + "]";
    }

    //----- Getters and Setters
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
}

class LineRunner {
    public static void main(String[] args) {
        Line line = new Line(
                new Point(0., 0.),
                new Point(1., 1.));
        System.out.println(line);

        Point pointA = line.getPointA();
        pointA = pointA.setX(100.);

        System.out.println(line);
    }
}