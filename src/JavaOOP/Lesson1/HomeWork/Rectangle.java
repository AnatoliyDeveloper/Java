package JavaOOP.Lesson1.HomeWork;

import java.util.Random;

/**
 * Created by Anatoliy on 02.10.2016.
 */
/*
Написать класс Rectangle (Прямоугольник), содержащий размеры (высоту и ширину),
и умеющий подсчитывать свои периметр и площадь.
 */
public class Rectangle {

    private final int height;
    private final int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public Rectangle(){
        Random random = new Random();
        height = random.nextInt(20) + 1;
        width = random.nextInt(20) + 1;
    }

    public int perimeterRectangle(){
        return (2 * (height + width));
    }

    public int areaRectangle(){
        return (height * width);
    }

    public void printRectangle(){
        System.out.println("height rectangle = " + height + ", width rectangle = " + width);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
