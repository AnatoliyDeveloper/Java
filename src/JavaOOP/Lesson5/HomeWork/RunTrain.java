package JavaOOP.Lesson5.HomeWork;

/**
 * Created by Anatoliy on 17.10.2016.
 */
public class RunTrain {

    public static void main(String[] args) {
        TrainProperty train = new TrainProperty();
        boolean finishGame = false;
        int num = 0;

        if (!train.isLightOn()){
            train.lightOn();
        }

        while (!finishGame) {
            num = searchBulb(train);

            if (startRailwayCarriage(train, num)) {
                finishGame = true;
            }
        }

        System.out.println("Train consists of " + num + " carriages.");
        System.out.println("This is correct? " + train.isLength(num));

    }

    private static int searchBulb(TrainProperty train) {
        int num = 1;
        train.turnRight();

        while (!train.isLightOn()){
            train.turnRight();
            num ++;
        }

        train.lightOff();
        return num;
    }


    public static boolean startRailwayCarriage(TrainProperty train, int num) {
        for (int i = 0; i < num; i++) {
            train.turnLeft();
        }
        return !train.isLightOn();

    }
}
