package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */
import java.util.Arrays;

/**
 * Заполнение массива заданным числом.
 *
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[10];
        fill(array, 100);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Заполняет массив заданным числом.
     *
     * @param array исходный массив.
     * @param filler заполнитель.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static void fill(int[] array, int filler) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
