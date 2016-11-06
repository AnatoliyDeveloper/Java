package JavaOOP.Lesson2.Fun;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class HeartSample {
    public static void main(String[] args) {
        Person boy = new Person();
        System.out.println(boy);

        Heart heartInGirlHand = boy.getHeart();
        // After some time
        heartInGirlHand.brokeHeart();

        System.out.println(boy);
    }
}

class Person {
    private Heart heart = new Heart(true);

    public Heart getHeart() {
        return heart;
    }

    @Override
    public String toString() {
        return "I have heart. " + heart;
    }
}

final class Heart {
    private final boolean isHappy;

    public Heart(boolean isHappy) {
        this.isHappy = isHappy;
    }

    public Heart brokeHeart() {
        return new Heart(false);
    }

    public boolean isHappy() {
        return isHappy;
    }

    @Override
    public String toString() {
        return "Heart is " + (isHappy ? "happy" : "broken");
    }
}
