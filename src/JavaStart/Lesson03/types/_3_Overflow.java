package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_Overflow {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);

        b += 10;
        System.out.println(b);
    }
}
