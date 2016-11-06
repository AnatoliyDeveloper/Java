package JavaOOP.Lesson3.Rectangle;

import java.util.List;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class RectangleUtils {

    private RectangleUtils() {}

    public static int areaSum(List<Rectangle> rectangles) {
        int areaSum = 0;
        for (Rectangle rectangle : rectangles) {
            areaSum += rectangle.getArea();
        }
        return areaSum;
    }

    public static void printRectangles(List<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
