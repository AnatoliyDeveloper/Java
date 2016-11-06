package JavaStart.Lesson05;

/**
 * Created by Anatoliy on 19.09.2016.
 */
public class ForSample {

    public static void main(String[] args) {
        // 1..10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 10..1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1..10, evens
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1..10, evens (BAD)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
