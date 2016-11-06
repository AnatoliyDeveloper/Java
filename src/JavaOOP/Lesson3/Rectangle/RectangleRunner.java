package JavaOOP.Lesson3.Rectangle;

import java.util.ArrayList;
import java.util.List;

import static JavaOOP.Lesson3.Rectangle.RectangleUtils.areaSum;
import static JavaOOP.Lesson3.Rectangle.RectangleUtils.printRectangles;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class RectangleRunner {

    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 10));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(2, 2));
        printRectangles(rectangles);

        System.out.println("areaSum = " + areaSum(rectangles));
    }
}
