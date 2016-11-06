package JavaOOP.Lesson9.HomeWork.AgeCategoriesForPersons;

import java.util.*;

/**
 * Created by Anatoliy on 30.10.2016.
 */
public class AgeCategoriesForPersons {
    public static void main(String[] args) {
        List<Person> persons = createPersons();
        Map<Integer, Person> ageToPersonMap = prepareAgeToPersonMap(persons);

        findFrom12To17((TreeMap<Integer, Person>) ageToPersonMap); //O(n*ln(n))
        findYounger18((TreeMap<Integer, Person>) ageToPersonMap); //O(n*ln(n))
        findOlder18((TreeMap<Integer, Person>) ageToPersonMap); //O(n*ln(n))
    }

    private static void findOlder18(TreeMap<Integer, Person> map) {
        System.out.println(map.floorEntry(17));
    }

    private static void findYounger18(TreeMap<Integer, Person> map) {
        System.out.println(map.higherEntry(18));
    }


    private static void findFrom12To17(TreeMap<Integer, Person> map) {
        System.out.println(map.subMap(12, 18));
    }

    private static Map<Integer, Person> prepareAgeToPersonMap(List<Person> persons) {
        Map<Integer, Person> ageToPersonMap = new TreeMap<>();
        for (Person person : persons) {
            ageToPersonMap.put(person.getAge(), person);
        }
        return ageToPersonMap;
    }

    private static List<Person> createPersons() {
        return new ArrayList<>(Arrays.asList(
                new Person("Julia", 10),
                new Person("Alex", 13),
                new Person("Nadya", 18),
                new Person("Tatiana", 14),
                new Person("Ivan", 22),
                new Person("Anastasia", 15),
                new Person("Stephan", 19),
                new Person("Anna", 44),
                new Person("Anton", 12)
        ));
    }
}
