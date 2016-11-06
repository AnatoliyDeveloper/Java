package JavaStart.Lesson08.values_storing.presentation;

/**
 * @author Bohdan Vanchuhov
 */
public class Sample1 {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y++;
        System.out.println(x);

        String s1 = "Hello";
        String s2 = s1;

        System.out.println(s1 == s2);
    }
}
