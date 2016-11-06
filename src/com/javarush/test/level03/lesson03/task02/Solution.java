package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {

        double usd1 = convertEurToUsd(10, 1.2);
        System.out.println(usd1);

        double usd2 = convertEurToUsd(100, 1.2);
        System.out.println(usd2);
    }

    public static double convertEurToUsd(int eur, double course){

        double usd = ((double)eur * course);

        return usd;
    }
}
