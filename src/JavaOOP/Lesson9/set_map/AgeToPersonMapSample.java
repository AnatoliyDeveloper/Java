package JavaOOP.Lesson9.set_map;

import JavaOOP.Lesson3.Person.Person;
import java.util.*;

/**
 * Created by Anatoliy on 29.10.2016.
 */
public class AgeToPersonMapSample {

    public static void main(String[] args) {
        List<Person> persons = createPersons();
        Map<Integer, Person> ageToPersonMap = prepareAgeToPersonMap(persons);
        System.out.println("Init age->person map: " + ageToPersonMap);

        System.out.println("Person with age=25: " + ageToPersonMap.get(0));
        System.out.println("Person with age=100: " + ageToPersonMap.get(10));
        System.out.println();

        printKeys(ageToPersonMap);
        printValues(ageToPersonMap);
        printEntries(ageToPersonMap);
    }

    public static List<Person> createPersons() {
        return new ArrayList<>(Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        ));
    }

    private static Map<Integer, Person> prepareAgeToPersonMap(List<Person> persons) {
        Map<Integer, Person> ageToPersonMap = new TreeMap<>();

        for (Person person : persons) {
            ageToPersonMap.put(person.getAge(), person);
        }

        return ageToPersonMap;
    }

    private static void printKeys(Map<Integer, Person> map) {
        System.out.println("Keys:");

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key);
        }
        System.out.println();
    }

    private static void printValues(Map<Integer, Person> map) {
        System.out.println("Values:");

        Collection<Person> values = map.values();
        for (Person value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    private static void printEntries(Map<Integer, Person> map) {
        System.out.println("Entries:");

        Set<Map.Entry<Integer, Person>> entries = map.entrySet();
        for (Map.Entry<Integer, Person> entry : entries) {
            System.out.println(entry);
        }
        System.out.println();
    }
}
