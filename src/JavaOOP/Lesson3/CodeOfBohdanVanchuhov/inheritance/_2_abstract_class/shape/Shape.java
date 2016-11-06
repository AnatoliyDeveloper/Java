package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._2_abstract_class.shape;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void draw();

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
