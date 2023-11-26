package com.copra.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapIterationExample {
    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs of string to integer
        Map<String, Integer> scores = new HashMap<>();

        // Adding elements to the Map
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 90);
        scores.put("David", 88);

        // Method 1: Using Map.Entry Set and For-Each Loop
        System.out.println("Method 1: Using Map.Entry Set and For-Each Loop");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }

        // Method 2: Using Key Set and For-Each Loop
        System.out.println("Method 2: Using Key Set and For-Each Loop");
        for (String key : scores.keySet()) {
            Integer value = scores.get(key);
            System.out.println(key + " -> " + value);
        }

        // Method 3: Using Values Collection and For-Each Loop
        System.out.println("Method 3: Using Values Collection and For-Each Loop");
        for (Integer value : scores.values()) {
            System.out.println("Value: " + value);
        }

        // Method 4: Using Iterator
        System.out.println("Method 4: Using Iterator");
        Iterator<Map.Entry<String, Integer>> iterator = scores.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }

        // Method 5: Using Lambda Expressions (Java 8+)
        System.out.println("Method 5: Using Lambda Expressions (Java 8+)");
        scores.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}

