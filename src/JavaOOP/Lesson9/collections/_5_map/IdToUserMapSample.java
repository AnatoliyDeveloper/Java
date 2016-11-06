package com.bvan.javaoop.collections._5_map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 25.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class IdToUserMapSample {
    public static void main(String[] args) {
        Map<Long, User> idToUserMap = new HashMap<>();

        idToUserMap.put(0L, new User("John", 30));
        idToUserMap.put(1L, new User("John", 30));
        idToUserMap.put(2L, new User("Add", 31));

        User user = idToUserMap.get(4L);
        System.out.println(user);
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
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
}
