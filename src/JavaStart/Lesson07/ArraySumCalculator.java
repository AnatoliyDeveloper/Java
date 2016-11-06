package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/**
 * Подсчет суммы элементов массива.
 *
 * @author bvanchuhov
 */
public class ArraySumCalculator {

    public static void main(String[] args) {
        int[] array = {30, -10, 20, 100};
        System.out.println("sum with foreach = " + sum(array));
        System.out.println("sum with iteration = " + sumWithIteration(array));
    }

    /**
     * Подсчитывает сумму элеметов массива.<br/>
     * <b>Решение с использование for-each.</b>
     *
     * @param array исходный массив.
     * @return сумма элементов массива.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static int sum(int[] array) {
        checkNotNull(array);

        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        return sum;
    }

    /**
     * Подсчитывает сумму элеметов массива.<br/>
     * <b>Решение с использование обычной итерации (нежелательно).</b>
     *
     * @param array исходный массив.
     * @return сумма элементов массива.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    @Deprecated
    public static int sumWithIteration(int[] array) {
        checkNotNull(array);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }

        return sum;
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
