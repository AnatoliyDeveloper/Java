package JavaOOP.Lesson6.ExceptionsAndEnumeration.ExceptionSamples;

import JavaOOP.Lesson6.User.GoodUser.Gender;

import java.util.Scanner;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class GenderReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (MALE, FEMALE, UNDEFINED): ");
        String genderString = scanner.next();

        try {
            Gender gender = Gender.valueOf(genderString.toUpperCase());
            System.out.println("Your gender is " + gender);
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, Illegal input");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
