package JavaOOP.Lesson4.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 12.10.2016.
 */
public class ShapeRunner {

    public static void main(String[] args) {

        List <Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10,20));
        shapes.add(new Circle(20));

        int sumArea = sumArea(shapes);
        System.out.println("Sum all area = " + sumArea);
    }

    public static int sumArea(List<Shape> shapes){
        int sumArea = 0;
        for(Shape shape: shapes){
            sumArea += shape.getArea();
        }
        return sumArea;
    }
}
