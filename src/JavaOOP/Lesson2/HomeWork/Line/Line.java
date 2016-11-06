package JavaOOP.Lesson2.HomeWork.Line;

import java.text.DecimalFormat;

/**
 * Created by Anatoliy on 07.10.2016.
 */
final class Line {

    private final Point start = new Point();
    private final Point end = new Point();

    public double getlength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public void printLine() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Start point ( " + start.getX() + " , " + start.getY() + " )");
        System.out.println("End point ( " + end.getX() + " , " + end.getY() + " )");
        System.out.println("Length line: " + df.format(getlength()));
    }
}
