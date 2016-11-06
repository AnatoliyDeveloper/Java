package JavaOOP.Lesson2.Person.GoodPerson;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class Validator {

    public static boolean isName(String name) {
        return true;
    }

    public static boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }
}
