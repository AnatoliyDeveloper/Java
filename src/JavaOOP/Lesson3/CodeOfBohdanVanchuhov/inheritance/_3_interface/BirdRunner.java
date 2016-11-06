package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._3_interface;

import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._3_interface.bird.Duck;
import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._3_interface.bird.Eagle;
import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._3_interface.bird.Flyable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class BirdRunner {
    public static void main(String[] args) {
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Duck());
        flyables.add(new Eagle());

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
