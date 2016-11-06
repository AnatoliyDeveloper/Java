package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._3_interface.bird;

/**
 * @author Bohdan Vanchuhov
 */
public class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm eagle. I'm fast and sharp");
    }
}
