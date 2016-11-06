package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */

import java.util.Arrays;

/**
 * ѕоследовательное заполнение элеметов массива в обратном пор€дке.
 *
 * @author bvanchuhov
 */
public class ArrayReverseSequenceFiller {

    public static void main(String[] args) {
        testV1();
        testV2();
    }

    private static void testV1() {
        int[] array = new int[10];
        reverseSequenceFillV1(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testV2() {
        int[] array = new int[10];
        reverseSequenceFillV2(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * ѕоследовательно заполн€ет массив числами от {@code length}-1 до 0 (обратный пор€док).<br/>
     * ѕример: массив из 5 элеметов должен быть заполнен {4, 3, 2, 1, 0}.<br/>
     * <b>¬ерси€ 1.</b>
     *
     * @param array исходный массив.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static void reverseSequenceFillV1(int[] array) {
        checkNotNull(array);

        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler--;
        }
    }

    /**
     * ѕоследовательно заполн€ет массив числами от {@code length}-1 до 0 (обратный пор€док).<br/>
     * ѕример: массив из 5 элеметов должен быть заполнен {4, 3, 2, 1, 0}.<br/>
     * <b>¬ерси€ 2.</b>
     *
     * @param array исходный массив.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static void reverseSequenceFillV2(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i - 1;
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
