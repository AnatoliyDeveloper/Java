package JavaOOP.Lesson10.courseproject.common;

import java.util.Random;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public final class RandomIdGenerator {

    private static Random random = new Random();

    private RandomIdGenerator() {}

    /**
     * Генерирует псевдослучайный id типа int.
     *
     * @return псевдослучайный id.
     */
    public static int generateInt() {
        return random.nextInt();
    }
}
