package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._2_abstract_class.shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
