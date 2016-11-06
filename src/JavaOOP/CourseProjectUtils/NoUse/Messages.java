package JavaOOP.CourseProjectUtils.NoUse;

import java.util.Scanner;

/**
 * Created by Anatoliy on 08.10.2016.
 */
public class Messages {

    public void message(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = in.nextLine();

        System.out.println(message);
    }
}
