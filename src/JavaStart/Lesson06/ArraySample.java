package JavaStart.Lesson06;

/**
 * Created by Anatoliy on 21.09.2016.
 */
public class ArraySample {

    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        int sum = sum(array);
        System.out.println("sum = " + sum);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }
        return sum;
    }

    public static int sumWithForeach(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    private static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }

}
