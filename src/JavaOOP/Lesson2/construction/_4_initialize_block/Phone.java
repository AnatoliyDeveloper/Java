package ua.kiev.prog.javaoop.construction._4_initialize_block;

import java.util.Random;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Phone {
    private String number;

    {
        System.out.println("Init block");
        number = generateNumber();
    }

    private static String generateNumber() {
        Random random = new Random();

        return Integer.toString(random.nextInt(Integer.MAX_VALUE));
    }

    public Phone() {
        System.out.println("Constructor Phone()");
    }

    public Phone(String number) {
        System.out.println("Constructor Phone(String)");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}

class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println();

        Phone phone2 = new Phone("123");
    }
}