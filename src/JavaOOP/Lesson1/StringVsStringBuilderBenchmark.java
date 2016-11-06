package JavaOOP.Lesson1;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class StringVsStringBuilderBenchmark {
    public static final int ADDING_QUANTITY = 1_000_000;
    public static final String STRING_FOR_APPEND = "1";

    public static void main(String[] args) {
        System.out.println("String builder: " + useStringBuilderTime());
        System.out.println("String buffer: " + useStringBufferTime());
        System.out.println("String: " + useStringTime());
    }

    private static void useStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            sb.append(STRING_FOR_APPEND);
        }
    }

    private static void useStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            sb.append(STRING_FOR_APPEND);
        }
    }

    private static void useString() {
        String s = "";
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            s += STRING_FOR_APPEND;
        }
    }

    private static long useStringBuilderTime() {
        long start = System.currentTimeMillis();

        useStringBuilder();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long useStringBufferTime() {
        long start = System.currentTimeMillis();

        useStringBuffer();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long useStringTime() {
        long start = System.currentTimeMillis();

        useString();

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
