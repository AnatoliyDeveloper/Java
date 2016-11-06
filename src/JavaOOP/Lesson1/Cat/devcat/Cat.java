package JavaOOP.Lesson1.Cat.devcat;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class Cat {

    private String name;
    private int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void say() {
        System.out.println("Мяу!!!");
    }

    @Override
    public String toString() {
        return "Cat [Имя: " + name + ". Возраст: " + age + " года. Порода: " + breed + "]";
    }
}
