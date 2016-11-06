package JavaOOP.Lesson2.mutability.mutable;

/**
 * Mutable point
 * @author Bohdan Vanchuhov
 */
public class MutablePoint implements Cloneable {
    private double x;
    private double y;

    public MutablePoint() {
    }

    public MutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MutablePoint(MutablePoint point) {
        this.x = point.x;
        this.y = point.y;
    }

    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(x).append(", ").append(y).append(")");
        return sb.toString();
    }

    @Override
    public MutablePoint clone() {
        return new MutablePoint(x, y);
    }

    //----- Getters and Setters -----

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class MutablePointRunner {
    public static void main(String[] args) {
        MutablePoint p1 = new MutablePoint();
        System.out.println("p1 = " + p1); // (0.0, 0.0)

        MutablePoint p2 = p1;

        p2.setX(10.);
        System.out.println("p1 = " + p1);
    }
}
