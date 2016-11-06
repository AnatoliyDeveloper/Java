package JavaStart.Lesson04.HomeWork;

/**
 * Created by Anatoliy on 17.09.2016.
 */
public class MinThreeInt {

    public static void main(String[] args) {

        // Даны числа int a, b, c. Найти min.
        int a = 100;
        int b = 20;
        int c = 10;

        if (a < b && a < c) {
            System.out.println("MIN = " + a);
        }
        else if (b < a && b < c) {
            System.out.println("MIN = " + b);
        }
        else if (c < a && c < b) {
            System.out.println("MIN = " + c);
        }
    }
}
