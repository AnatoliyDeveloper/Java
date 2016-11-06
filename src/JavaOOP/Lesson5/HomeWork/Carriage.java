package JavaOOP.Lesson5.HomeWork;

/**
 * Created by Anatoliy on 17.10.2016.
 */
public class Carriage {

    private boolean light;
    private int num;

    public Carriage(int num, boolean light) {
        this.num = num;
        this.light = light;
    }

    public boolean isOnLight(){
        return light;
    }

    public void changeLight(){
        light = !light;
    }

    public int getNum() {
        return num;
    }
}
