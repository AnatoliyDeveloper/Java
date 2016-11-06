package Lessons;

/**
 * Created by Anatoliy on 27.08.2016.
 */
public class Conkatenacuja{

    public static void main(String[] args)
    {

        /**int a = 5;
        String text = "A is " + a;
        System.out.println(text);
        */

        /*int a = 5;
        String text = a + " A is ";
        System.out.println(text);
        /*

        /*
        Cat cat = new Cat();
        int a = 5;
        String text = "Cat is " + cat + " " + a;
        System.out.println(text);
        */

        /*
        Cat cat = new Cat();
        int a = 5;
        String text = a + " Cat is " + cat + " " + a;
        System.out.println(text);
        */

        /*
        Cat cat = new Cat();
        int a = 5;
        String text = cat + " " + (a + "Cat is ") + cat + " " + a;
        System.out.println(text);
        */

        Cat cat = new Cat();
        int a = 5;
        String text = ((cat + " " + (a + " " + "Cat is ")) + cat)+ " " +a;
        System.out.println(text);

    }

}
