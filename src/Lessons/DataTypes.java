package Lessons;

/**
 * Created by Anatoliy on 04.09.2016.
 */
public class DataTypes{

    public static void main(String[] args) {
/*
        int x = 0xAB;
        int y = 0b10101010;
        int z = 010000;

        int a = 1;
        double b = 7.5;
        long c = 100000, d = 33333;
        char d1 = 'A';
        boolean e = true;
        short f = 500;
        int g = f + 300;

        int j = 1; // превратится в double x = 1.0
        double i = 2.3;
        double t = j + i - 5.2;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        */

        byte a = (byte)(127 + 1);
        short x = Byte.MAX_VALUE + 1; /* 127 + 1 = 128 */
        byte y = (byte)x;
        byte z = (byte)(x + 129);
        System.out.println(a);  // -128 !!! Переполнение
        System.out.println(x);  // 128 // Все ОК
        System.out.println(y); // -128
        System.out.println(z); // 1

    }

}
