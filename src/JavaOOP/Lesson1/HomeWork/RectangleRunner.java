package JavaOOP.Lesson1.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 02.10.2016.
 */
/*
Написать клиентский класс RectangleRunner,
создающий список прямоугольников и подсчитывающий их суммарную площадь.
 */
public class RectangleRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rectangles: ");
        int number = in.nextInt();

        Rectangle[] rectangles = createRectangles(number);

        int allAreasSum = getAreasSum(rectangles);

        printListRectangle(rectangles);
        System.out.println("Summary rectangles area is " + allAreasSum);
    }

    public static Rectangle[] createRectangles (int number){
        Rectangle[] rectangles = new Rectangle[number];
        for (int i = 0; i < number; i++) {
            rectangles[i] = new Rectangle();
        }
        return rectangles;
    }

    public static int getAreasSum(Rectangle[] rectangles) {
        int allAreas = 0;
        for (Rectangle rectangle : rectangles){
            allAreas += rectangle.areaRectangle();
        }
        return allAreas;
    }

    public static void printListRectangle(Rectangle[] rectangles){
        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Rectangle " + i + ": ");
            rectangles[i].printRectangle();
            System.out.println("Area = " + rectangles[i].areaRectangle());
            System.out.println("Perimeter = " + rectangles[i].perimeterRectangle());
            System.out.println();
        }
    }
}
