package JavaOOP.Lesson7.HomeWork.Generics.Range;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class RangeRunner {
    public static void main(String[] args) {
        Range<Integer> integerRange = new Range<>(30, 40);
        System.out.println(integerRange);

        Range<Long> range = new Range<>(10L, 56L);
        System.out.println(range);

        Range<Double> doubleRange = new Range<>(45D, 80D);
        System.out.println(doubleRange);

        Range<Float> floatRange = new Range<>(34F, 67F);
        System.out.println(floatRange);

    }
}
