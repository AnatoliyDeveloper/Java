package ua.kiev.prog.javaoop.construction._6_flyweight;

/**
 * Created on 28.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public final class Digit {
    public static final int RADIX = 10;

    private static Digit[] digitsCash = initDigitsCash();

    private static Digit[] initDigitsCash() {
        Digit[] digitsCash = new Digit[RADIX];
        for (int i = 0; i < RADIX; i++) {
            digitsCash[i] = new Digit(i);
        }
        return digitsCash;
    }

    private int value;

    public static Digit valueOf(int value) {
        checkDigit(value);
        return digitsCash[value];
    }

    private static void checkDigit(int value) {
        if (value < 0 || value >= RADIX) {
            throw new IllegalArgumentException("A digit should be in the range [0, " + (RADIX+1) + "]");
        }
    }

    private Digit(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }
}

class DigitRunner {
    public static void main(String[] args) {
        Digit d1 = Digit.valueOf(3);
        Digit d2 = Digit.valueOf(3);

        System.out.println(d1.intValue());
        System.out.println(d1 == d2);
    }
}
