package com.bvan.javaoop.collections._5_map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bohdan Vanchuhov
 */
public class NameToIdMapSample {
    public static void main(String[] args) {
        Map<String, Integer> nameToIdMap = new HashMap<>();

        nameToIdMap.put("John", 100);
        nameToIdMap.put("Cliff", 50);
        nameToIdMap.put("Bohdan", 3);

        Integer a = nameToIdMap.put("Bob", 1000);
        System.out.println(a);

        Integer bohdanId = nameToIdMap.get("Bohdan");
        System.out.println(bohdanId);

        for (String key : nameToIdMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        for (Integer value : nameToIdMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        for (Map.Entry<String, Integer> entry : nameToIdMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
