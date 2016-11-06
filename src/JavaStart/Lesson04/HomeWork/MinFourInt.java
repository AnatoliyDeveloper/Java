package JavaStart.Lesson04.HomeWork;

/**
 * Created by Anatoliy on 17.09.2016.
 */
public class MinFourInt {

    public static void main(String[] args) {

        //Даны числа int a, b, c, d. Найти min.
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;


        if (a < b && a < c && a < d){
            System.out.println("min = " + a);
        }
        if (b < a && b < c && b < d){
            System.out.println("min = " + b);
        }
        if (c < a && c < b && c < d){
            System.out.println("min = " + c);
        }
        if (d < a && d < b && d < c){
            System.out.println("min = " + d);
        }

    }

}
