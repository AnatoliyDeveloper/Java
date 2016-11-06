package JavaOOP.Lesson1.Cat.devcat;

import JavaOOP.Lesson1.Cat.devpeople.People;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Sportsman extends People {

    public Sportsman(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);
    }

    private String typeSport;

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello BIG SPORT!!!");
    }

    @Override
    public String toString() {
        return "Sportsman [ Имя: " + getName() + ". Фамилия: " + getLastName() + ". Возраст: "  + getAge() + " лет. Есть кот: " + getCat() + ". TypeSport = " + getTypeSport() + " ]";
    }
}
