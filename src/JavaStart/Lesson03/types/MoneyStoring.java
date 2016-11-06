package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class MoneyStoring {
    public static final int MONEY_COEFFICIENT = 10_000_000; // Java 7

    public static void main(String[] args) {
        long money = 221749157;
        double moneyForOutput = (double)money / MONEY_COEFFICIENT;

        System.out.println(moneyForOutput);
    }
}
