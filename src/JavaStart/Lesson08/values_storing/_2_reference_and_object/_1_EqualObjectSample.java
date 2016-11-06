package JavaStart.Lesson08.values_storing._2_reference_and_object;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_EqualObjectSample {
    public static void main(String[] args) {
        String s1 = "Hello";                //new_tastks String("Hello");
        String s2 = new String("Hello").intern();    //new_tastks String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
