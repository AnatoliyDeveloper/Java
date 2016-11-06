package JavaStart.Lesson02.HomeWork;

/**
 * Created by Anatoliy on 10.09.2016.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        int a = 2_000_000_000;
        int b = 2_000_000_000;

        int avg = (a / 2 + b / 2) + (a % 2 + b % 2)/2;

        System.out.println(avg);
    }

}
