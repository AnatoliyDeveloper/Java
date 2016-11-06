package JavaStart.Lesson06;

/**
 * Created by Anatoliy on 21.09.2016.
 */
public class MinCalculator {

    public static void main(String[] args) {
        int x = min(10, 20); // Client
        System.out.println(x); // 10
    }

    public static int min(int a, int b) { // Creator
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
