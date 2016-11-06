package JavaStart.Lesson02.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class Scan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter s1 = ");
        String s1 = in.nextLine();
        System.out.print("Enter s2 = ");
        String s2 = in.nextLine();
        System.out.print("Enter s3 = ");
        String s3 = in.nextLine();

        String s4 = s1 + s3;
        String s5 = s3 + s2 + s1;
        String s6 = s1 + s2 + s3;

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
