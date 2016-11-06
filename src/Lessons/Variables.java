package Lessons;

/**
 * Created by Anatoliy on 29.08.2016.
 */
public class Variables{

    private static String TEXT = "The end.";

    public static void main(String[] args)
    {
        System.out.println("Hi");

        String s = "Hi!";
        System.out.println(s);

        if (args !=null){

            String s2 = s;
            System.out.println(s2);
        }

        Variables variables = new Variables();
        System.out.println(variables.classVariable);

        System.out.println(TEXT);
    }

    public String classVariable;
    public Variables(){
        classVariable = "Class variable test.";
    }

}
