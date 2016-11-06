package JavaStart.Lesson05;

/**
 * Created by Anatoliy on 19.09.2016.
 */
public class SumCalculator {

    public static void main(String[] args) {
        // Input
        int from = 10;
        int to = 15;

        // BL
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }

        // Output
        System.out.println("sum = " + sum);
    }

}
