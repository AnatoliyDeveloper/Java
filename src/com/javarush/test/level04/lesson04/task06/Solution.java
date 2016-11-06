package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ));
        String s = reader.readLine();
        int i = Integer.parseInt(s);

        if ( i <= 7 && i > 0 && i != 0 )
        {
            if (i == 1)
                System.out.println("понедельник");
            if (i == 2)
                System.out.println("вторник");
            if (i == 3)
                System.out.println("среда");
            if (i == 4)
                System.out.println("четверг");
            if (i == 5)
                System.out.println("пятница");
            if (i == 6)
                System.out.println("суббота");
            if (i == 7)
                System.out.println("воскресенье");
        }

        else
            System.out.println("такого дня недели не существует");

    }

}