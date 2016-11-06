package JavaOOP.Lesson9.HomeWork.UniqueSortedPersons;

/**
 * Unique Sorted Persons (*).
 * Задан List<Person> pesons.
 * Вывести людей в алфавитном порядке имен так, чтобы люди с одинаковыми именами не повторялись.
 Подсказка: TreeSet.
 */

import java.util.*;


/**
 * Created by Anatoliy on 30.10.2016.
 */
public class UniqueSortedPersons {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("Vasily", 30),
            new Person("Alexa", 20),
            new Person("Nikolay", 25),
            new Person("Peter", 40),
            new Person("Ivan", 24),
            new Person("Anastasia", 22),
            new Person("Ilona", 18),
            new Person("Alina", 23),
            new Person("Fedor", 26)
        ));

        Map<String, Person> nameToPersonMap = nameToPersonMap(persons);

        printAlphabetOrder(nameToPersonMap);
    }

    private static void printAlphabetOrder(Map <String, Person> map) {

        Collection<Person> v = map.values();

        for (Person val : v) {
            System.out.println(val);
        }
    }

    private static Map<String, Person> nameToPersonMap(List<Person> persons) {

        Map<String, Person> nameToPersonMap = new TreeMap<>();

        for (Person person : persons) {
            nameToPersonMap.put(person.getName(), person);
        }

        return nameToPersonMap;
    }
}
