package JavaOOP.Lesson10.User;

import java.util.Random;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public class IdGenerator {

    private static final Random random = new Random();

    public static long generateId() {
        return random.nextLong();
    }
}
