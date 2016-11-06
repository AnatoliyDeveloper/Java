package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class _6_Char {
    public static void main(String[] args) {
//        char c1 = 'a';
//        char c2 = '\n';
//        char c3 = '\u00AB';
//        char c4 = 10_000;
//
//        System.out.println("c1 = " + c1);
//        System.out.println("c2 = " + c2);
//        System.out.println("c3 = " + c3);
//        System.out.println("c4 = " + c4);

        outputAllChars();
    }

    private static void outputAllChars() {
        StringBuilder stringBuilder = new StringBuilder(Character.MAX_VALUE);

        for (int i = 0; i < Character.MAX_VALUE; i++) {
            char c = (char)i;
            stringBuilder.append(c);

            if (i % 100 == 0)
                stringBuilder.append('\n');
        }

        System.out.println(stringBuilder.toString());
    }
}
