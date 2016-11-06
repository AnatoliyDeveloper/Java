package JavaStart.Lesson05.HomeWork.Conditions;

import java.util.Scanner;

/**
 * Created by Anatoliy on 18.09.2016.
 */
/*
Определение названия детской игрушки по ее идентификатору. Если данной
игрушки нет, бросить исключение IllegalArgumentException. Реализовать с помощью if-
else цепочки.
 */
public class IdToToyNameConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter id = ");
        int id = in.nextInt();
        in.close();

        String getToyName1 = "\"Car\"";
        String getToyName2 = "\"Lego\"";
        String getToyName3 = "\"Doll\"";
        String getToyName4 = "\"Puzzle\"";

        if (id < 0 || id > 3)
        {
            throw new IllegalArgumentException();
        }

        if (id == 0) {
            System.out.println(getToyName1);
        } else if (id == 1) {
            System.out.println(getToyName2);
        } else if (id == 2) {
            System.out.println(getToyName3);
        } else if (id == 3) {
            System.out.println(getToyName4);
        }
    }
}
