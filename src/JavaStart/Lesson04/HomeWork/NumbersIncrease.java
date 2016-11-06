package JavaStart.Lesson04.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 17.09.2016.
 */
public class NumbersIncrease {

    public static void main(String[] args) {

        //Даны числа int a, b, c. Вывести их в порядке возрастания.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int a = ");
        int a = sc.nextInt();

        System.out.print("Enter int b = ");
        int b = sc.nextInt();

        System.out.print("Enter int c = ");
        int c = sc.nextInt();

        sc.close();


        if (a < b && a < c) {
            {
                if (b < c)
                {
                    System.out.print(a + " " + b + " " + c);
                } else if (c < b)
                {
                    System.out.println(a + " " + c + " " + b);
                }
            }
        }

        else if (b < a && b < c){
            if (a < c){
                System.out.println(b + " " + a + " " + c);
            }else if(c < a){
                System.out.println(b + " " + c + " " + a);
            }
        }

        else if (c < a && c < b){
            if (a < b){
                System.out.println(c + " " + a + " " + b);
            }else if(b < a){
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
