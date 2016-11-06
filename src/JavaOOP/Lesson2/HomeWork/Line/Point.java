package JavaOOP.Lesson2.HomeWork.Line;

import java.util.Random;

/**
 * Created by Anatoliy on 07.10.2016.
 */
final class Point {

    private final Random random = new Random();
    private final int x = random.nextInt(100) + 1;
    private final int y = random.nextInt(100) + 1;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
