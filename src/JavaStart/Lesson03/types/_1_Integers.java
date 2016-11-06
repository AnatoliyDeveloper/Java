package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_Integers {
    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 10_000_000;    // Java 7 and above
//        int x3 = 10_000_000_000;

        int x4 = 35;            // radix = 10
        int x5 = 035;           // radix = 8
        int x6 = 0x3DC;         // radix = 16
        int x7 = 0b1010_1001;   // radix = 2 (Java 7)

        System.out.println(x5);
        System.out.println(Integer.toOctalString(x5));
        System.out.println(Integer.toHexString(x5));

        //--------------------------------------------------

        byte b1 = 10;
        b1 = (byte) (b1 + 1);
//        byte b2 = 200;

        //--------------------------------------------------

        long l1 = 1_000_000;
//        long l2 = 10_000_000_000;
        long l3 = 10_000_000_000L;

        //--------------------------------------------------

        int x8 = b1;
//        int x9 = l1;
        int x10 = (int) l1;

        byte b = 100;
        long l = 3_000_000_000L;
        int x = (int)l;

        System.out.println(l);
        System.out.println(x);
    }
}
