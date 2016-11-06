package JavaOOP.Lesson5.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Anatoliy on 17.10.2016.
 */
public class TrainProperty implements Train {

    private List <Carriage> carriages = new ArrayList<>();
    private int lengthTrain;
    private Carriage carriage;

    public TrainProperty() {
        Random random = new Random();
        lengthTrain = random.nextInt(100);

        if ( lengthTrain < 0 ) {
            lengthTrain = -1 * lengthTrain;
        }
        if ( lengthTrain < 2 ) {
            lengthTrain = 2;
        }

        for (int i = 0; i <lengthTrain ; i++) {
            carriages.add(new Carriage(i, random.nextBoolean()));
        }

        carriage = carriages.get(random.nextInt(lengthTrain));
    }

    @Override
    public void turnLeft() {
        if ( carriage.getNum() - 1 < 0 ) {
            carriage = carriages.get(lengthTrain - 1);
        } else {
            carriage = carriages.get(carriage.getNum() - 1);
        }
    }

    @Override
    public void turnRight() {
        if ( carriage.getNum() + 1 < lengthTrain ) {
            carriage = carriages.get( carriage.getNum() + 1 );
        } else {
            carriage = carriages.get(0);
        }
    }

    @Override
    public void lightOn() {
        if (!carriage.isOnLight()){
            carriage.changeLight();
        }
    }

    @Override
    public void lightOff() {
        if (carriage.isOnLight()){
            carriage.changeLight();
        }
    }

    @Override
    public boolean isLightOn() {
        return carriage.isOnLight();
    }

    @Override
    public boolean isLength(int expectedLength) {
        return (expectedLength == lengthTrain);
    }
}
