package JavaOOP.Lesson6.User.BadUser;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser john = new BadUser("John", 25, 1);
        System.out.println(john);

        String genderName = john.getGenderName();
        System.out.println("gender = " + genderName);
    }
}
