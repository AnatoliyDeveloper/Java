package JavaOOP.Lesson2.HomeWork.Line;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Anatoliy on 07.10.2016.
 */
/*
1. Создать список разных линий.
2. Посчитать суммарный размер всех линий.
3. Найти самую длинную линию.
 */
public class LineRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter positive number lines = ");
        int number = in.nextInt();

        validator(number);

        Line[] lines = getLines(number);

        double sumLength = sumLengths(lines);
        double maxLength = maxLine(lines);

        for (int i = 0; i < number; i++) {
            System.out.print("Line " + (i + 1) + ": ");
            lines[i].printLine();
            System.out.println();
        }

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Summary length: " + df.format(sumLength));
        System.out.println("Maximal length: " + df.format(maxLength));
    }

    public static Line[] getLines(int number) {
        Line[] lines = new Line[number];
        for (int i = 0; i < number; i++) {
            lines[i] = new Line();
        }
        return lines;
    }

    public static void validator(int number) {
        if(number <= 0){
            throw new IllegalArgumentException("Please enter positive number lines. But actually " + number);
        }
    }

    public static double sumLengths(Line[] lines) {
        double sum = 0;
        for (Line line : lines) {
            sum += line.getlength();
        }
        return sum;
    }

    public static double maxLine(Line[] lines) {
        double max = lines[0].getlength();
        for (Line line : lines) {
            if (max < line.getlength()) {
                max = line.getlength();
            }
        }
        return max;
    }
}
