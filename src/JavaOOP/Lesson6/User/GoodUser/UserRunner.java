package JavaOOP.Lesson6.User.GoodUser;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class UserRunner {

    public static void main(String[] args) {
        User john = new User("John", 25, Gender.MALE);
        System.out.println(john);
    }
}
