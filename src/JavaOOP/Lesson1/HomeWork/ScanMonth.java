package JavaOOP.Lesson1.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 02.10.2016.
 */
/*
Ввести число от 1 до 12.
Вывести на консоль название месяца, соответствующего данному числу.
Осуществить проверку корректности ввода чисел.
 */
public class ScanMonth {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number month [1...12]: ");
        int month = in.nextInt();
        in.close();

        checkEnteredMonth(month);
        String currentMonth = checkMonth(month);

        System.out.println("Your entered month: " + currentMonth);
    }

    public static String checkMonth(int month) {
        String[] year = {"January", "February",
                "March", "April", "May",
                "June", "July", "August",
                "September", "October", "November",
                "December"
        };
        String currentMonth = year[month - 1];

        return currentMonth;
    }

    public static void checkEnteredMonth(int month) {
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Please enter correct month 1...12. But you entered " + month);
        }
    }
}
