package JavaOOP.Lesson8.Train;

/**
 * Created by Anatoliy on 26.10.2016.
 */
public interface Train {

    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
