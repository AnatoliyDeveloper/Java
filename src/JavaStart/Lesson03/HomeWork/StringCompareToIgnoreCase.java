package JavaStart.Lesson03.HomeWork;

/**
 * Created by Anatoliy on 11.09.2016.
 */
public class StringCompareToIgnoreCase {

    public static void main(String[] args) {

        String s1 = "Как сравнить 2 строки по содержимому без учета регистра (строчная и заглавная буквы не различаются)?";
        String s2 = "как сравнить 2 строки по содержимому без учета регистра (строчная и заглавная буквы не различаются)?";

        String s3 = "Как сравнить 2 строки по содержимому без учета регистра (строчная и заглавная буквы не различаются)?";
        String s4 = "Как сравнить 2 строки по содержимому без учета регистра (строчная и заглавная буквы не различаются)?";

        System.out.println("equalsIgnoreCase s1 and s2 = " + s1.equalsIgnoreCase(s2));
        System.out.println("equalsIgnoreCase s3 and s4 = " + s3.equalsIgnoreCase(s4));

    }

}
