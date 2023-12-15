package com.copra.collections;

import java.util.*;

/*
put(): Adds key-value pairs to the HashMap.
get(): Accesses values by key.
Modifying a value associated with a key.
remove(): Removes a key-value pair.
containsKey(): Checks if a specific key exists in the HashMap.
containsValue(): Checks if a specific value exists in the HashMap.
Getting the keys and values as Sets.
Iterating through the key-value pairs using an enhanced for loop and Map.Entry.
size(): Gets the number of key-value pairs in the HashMap.
clear(): Removes all key-value pairs from the HashMap.
 */

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs of string to integer
        Map<String, Integer> scores = new HashMap<>();

        // Adding elements to the HashMap
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 90);
        scores.put("David", 88);
        scores.put("David", 92);

        // Printing the HashMap
        System.out.println("HashMap: "+scores);

        // Accessing values by key
        System.out.println("Alice's score: "+scores.get("Alice"));

        // Modifying a value
        scores.put("Bob",92);
        System.out.println("Modified HashMap: "+scores);

        // Removing a key-value pair
        scores.remove("Alice");
        System.out.println("HashMap after removing Alice:"+scores);

        // Checking if a key exists
        System.out.println("Does HashMap contain Charlie? "+scores.containsKey("Charlie"));

        // Checking if a value exists
        System.out.println("Does HashMap contain the score 90? "+scores.containsValue(91));

        // Getting the keys and values as Sets
        Set<String> keys = scores.keySet();
        System.out.println("Keys in HashMap: " + keys);

        Set<Integer> values  = new HashSet<>(scores.values());
        System.out.println("Values in HashMap: " + values);

        // Iterating through the key-value pairs
        System.out.println("Key-Value pairs in HashMap:");
        Iterator<Map.Entry<String,Integer>> itr = scores.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Integer> next = itr.next();
            System.out.println(next.getKey()+" - "+next.getValue());
        }

        // Getting the size of the HashMap

        System.out.println("Size of HashMap: " + scores.size());

        // Clearing the HashMap
        scores.clear();
        System.out.println("Cleared HashMap: " + scores);
    }
}

