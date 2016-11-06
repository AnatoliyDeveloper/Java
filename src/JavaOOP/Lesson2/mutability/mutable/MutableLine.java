package JavaOOP.Lesson2.mutability.mutable;

/**
 * @author Bohdan Vanchuhov
 */
public class MutableLine implements Cloneable{
    private MutablePoint pointA;
    private MutablePoint pointB;

    public MutableLine(MutablePoint pointA, MutablePoint pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public MutablePoint getPointA() {
        return pointA.clone();
    }

    public MutablePoint getPointB() {
        return pointB.clone();
    }

    public void setPointA(MutablePoint pointA) {
        this.pointA = pointA;
    }

    public void setPointB(MutablePoint pointB) {
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "[" + pointA + ", " + pointB + "]";
    }

    @Override
    public MutableLine clone() {
        return new MutableLine(pointA.clone(), pointB.clone());
    }
}

class MutableLineRunner {
    public static void main(String[] args) {
        MutableLine line = new MutableLine(
                new MutablePoint(0., 0.),
                new MutablePoint(1., 1.));
        System.out.println(line);

        MutablePoint pointA = line.getPointA();
        pointA.setX(100.);

        System.out.println(line);
    }
}
