package JavaOOP.Lesson9.CodeFromLecture;

import java.util.*;

/**
 * Created by Anatoliy on 29.10.2016.
 */
public class IdToUserMapSample {

    public static void main(String[] args) {
        Map<Long, User> idToUserMap = new TreeMap<>();

        idToUserMap.put(0L, new User("John", 25));
        idToUserMap.put(1L, new User("Bob", 30));
        idToUserMap.put(2L, null);

        printKeys(idToUserMap);
        printValues(idToUserMap);
        printEntries(idToUserMap);
    }

    private static void printKeys(Map<Long, User> idToUserMap) {
        System.out.println("Keys:");
        Set<Long> keys = idToUserMap.keySet();
        for (Long key : keys) {
            System.out.println(key);
        }
        System.out.println();
    }

    private static void printValues(Map<Long, User> idToUserMap) {
        System.out.println("Values:");
        Collection<User> values = idToUserMap.values();
        for (User value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    private static void printEntries(Map<Long, User> idToUserMap) {
        System.out.println("Entries:");
        Set<Map.Entry<Long, User>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, User> entry : entries) {
            System.out.println(entry);
        }
        System.out.println();
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
