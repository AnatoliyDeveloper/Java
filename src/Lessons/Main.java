package Lessons;

/**
 * Created by Anatoliy on 29.08.2016.
 */
public class Main
{
    public int count = 0;     //объявили переменную класса

    public void run()
    {
        count = 15;           //обращение к переменной класса
        int count = 10;       //объявили локальную переменную метода
        count ++;             //обращение к переменной метода
    }

    /*Переменная метода закрывает собой переменную класса

    Статическая переменная класса
    ClassName.variableName

    Примеры:
    Cat.catsCount

    Обычная переменная класса
    this.variableName

    Примеры:
    this.catsCount


    Так работает обычный нестатический метод:

    Как выглядит код
    Cat cat = new Cat();
    String name = cat.getName();
    cat.setAge(17);
    cat.setChildren(cat1, cat2, cat3);

    Что происходит на самом деле
    Cat cat = new Cat();
    String name = Cat.getName(cat);
    Cat.setAge(cat,17);
    Cat.setChildren(cat, cat1, cat2, cat3)


    А вот как работает статический метод:

    Как выглядит код
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    int catCount = Cat.getAllCatsCount();

    Что происходит на самом деле
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    int catCount = Cat.getAllCatsCount(null); */
}
