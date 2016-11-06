package JavaStart.Lesson08.values_storing.presentation;

/**
 * @author Bohdan Vanchuhov
 */
public class Sample5 {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = a1;

        a2[2] = 10;
        System.out.println(a1[2]);
    }
}
