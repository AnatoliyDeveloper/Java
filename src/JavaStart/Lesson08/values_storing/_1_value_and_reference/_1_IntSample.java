package JavaStart.Lesson08.values_storing._1_value_and_reference;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_IntSample {
    public static void main(String[] args) {
        int x = 10;
        add(x);
        System.out.println(x);
    }

    private static void add(int x) {
        x += 100;
    }
}
