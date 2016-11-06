package JavaOOP.Lesson8.Train;

/**
 * Created by Anatoliy on 26.10.2016.
 */
public class LengthFinder {

    public static void main(String[] args) {
        Train train = new TrainImpl();

        int expectedLength = findLength(train);

        System.out.println(expectedLength);
        System.out.println(train.isLength(expectedLength));
    }

    private static int findLength(Train train) {
        int num = 1;
        train.turnRight();

        while (!train.isLightOn()){
            train.turnRight();
            num ++;
        }

        train.lightOff();
        return num;
    }
}
