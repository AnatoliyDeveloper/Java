package JavaOOP.Lesson8.Train;

import java.util.Random;

/**
 * Created by Anatoliy on 26.10.2016.
 */
public class TrainImpl implements Train {

    public static final int MAX_LENGTH = 10000;

    private Car currentCar;
    private int length;

    public TrainImpl() {
        length = generateLength();
        initCars();
    }

    private int generateLength() {
        Random random = new Random();
        return 1 + random.nextInt(MAX_LENGTH);
    }

    private void initCars() {
        Car head = new Car();
        currentCar = head;

        for (int i = 1; i < length; i++) {
            Car newCar = new Car(currentCar, null);
            currentCar.next = newCar;
            currentCar = newCar;
        }

        currentCar.next = head;
        head.prev = currentCar;

        currentCar = head;
    }

    @Override
    public void turnLeft() {
        currentCar = currentCar.prev;
    }

    @Override
    public void turnRight() {
        currentCar = currentCar.next;
    }

    @Override
    public void lightOn() {
        currentCar.light = true;
    }

    @Override
    public void lightOff() {
        currentCar.light = false;
    }

    @Override
    public boolean isLightOn() {
        return currentCar.light;
    }

    @Override
    public boolean isLength(int expectedLength) {
        return length == expectedLength;
    }

    @Override
    public String toString() {
        return "TrainImpl{" +
                "currentCar id=" + currentCar.id +
                ", length=" + length +
                '}';
    }

    private static class Car {

        private static Random lightGenerator = new Random();
        private static int nextId = 0;

        int id = nextId++;
        boolean light;
        Car next;
        Car prev;

        public Car(Car prev, Car next, boolean light) {
            this.prev = prev;
            this.next = next;
            this.light = light;
        }

        public Car(Car prev, Car next) {
            this(prev, next, lightGenerator.nextBoolean());
        }

        public Car() {
            this(null, null);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", light=" + light +
                    ", next id=" + next.id +
                    ", prev id=" + prev.id +
                    '}';
        }
    }
}
