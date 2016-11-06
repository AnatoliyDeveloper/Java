package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._2_abstract_class.shape;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Rectangle extends Shape {
    protected double high;
    protected double width;

    public Rectangle(double x, double y, double high, double width) {
        super(x, y);
        this.high = high;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (high * width);
    }

    @Override
    public double getArea() {
        return high * width;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
