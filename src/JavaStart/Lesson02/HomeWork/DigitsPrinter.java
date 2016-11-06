package JavaStart.Lesson02.HomeWork;

/**
 * Created by Anatoliy on 10.09.2016.
 */

public class DigitsPrinter {

    public static void main(String[] args) {

        int n = 987654321;

        int n1 = ( n % 100000/10000 );
        int n2 = ( n % 10000/1000 );
        int n3 = ( n % 1000/100 );
        int n4 = ( n % 100/10 );
        int n5 = ( n % 10/1 );

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

    }

}
