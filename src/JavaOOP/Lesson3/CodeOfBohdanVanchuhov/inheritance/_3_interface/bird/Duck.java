package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._3_interface.bird;

/**
 * @author Bohdan Vanchuhov
 */
public class Duck implements Flyable, Swimmable {
    @Override
     public void fly() {
        System.out.println("I'm duck. I don't fly)");
    }

    @Override
    public void swim() {
        System.out.println("I'm duck. I can swim");
    }
}
