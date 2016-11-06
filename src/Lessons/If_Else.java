package Lessons;

/**
 * Created by Anatoliy on 30.08.2016.
 */
public class If_Else{

    public static void main(String[] args)
    {
        int a = 10, b = 100;

        if (a < b)
            System.out.println("a less b");
        else
            System.out.println("b less a");

        if (a < b)
        {
            System.out.println("А меньше Б");
            System.out.println("Б больше А");
        }
        else
        {
            System.out.println("Б меньше А");
            System.out.println("А больше Б");
        }

        if (a < b)
        {
            a = 0;
        }
        else
        {
        }

        if (a < b)
        {
            a = 0;
        }

        if (a < b)
            a = 0;

    }

}
