package com.copra.collections;

import java.util.Hashtable;
import java.util.Enumeration;

/*
put(): Adds key-value pairs to the Hashtable.
get(): Accesses values by key.
Modifying a value associated with a key.
remove(): Removes a key-value pair.
containsKey(): Checks if a specific key exists in the Hashtable.
containsValue(): Checks if a specific value exists in the Hashtable.
Getting the keys and values using keys() and elements().
size(): Gets the number of key-value pairs in the Hashtable.
clear(): Removes all key-value pairs from the Hashtable.
 */

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable with key-value pairs of string to integer
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Adding elements to the Hashtable
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 90);
        scores.put("David", 88);

        // Printing the Hashtable
        System.out.println("Hashtable: " + scores);

        // Accessing values by key
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Modifying a value
        scores.put("Bob", 92);
        System.out.println("Modified Hashtable: " + scores);

        // Removing a key-value pair
        scores.remove("Charlie");
        System.out.println("Hashtable after removing Charlie: " + scores);

        // Checking if a key exists
        boolean hasCharlie = scores.containsKey("Charlie");
        System.out.println("Does Hashtable contain Charlie? " + hasCharlie);

        // Checking if a value exists
        boolean hasScore90 = scores.containsValue(90);
        System.out.println("Does Hashtable contain the score 90? " + hasScore90);

        // Getting the keys
        Enumeration<String> keys = scores.keys();
        System.out.print("Keys in Hashtable: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // Getting the values
        Enumeration<Integer> values = scores.elements();
        System.out.print("Values in Hashtable: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println();

        // Getting the size of the Hashtable
        int size = scores.size();
        System.out.println("Size of Hashtable: " + size);

        // Clearing the Hashtable
        scores.clear();
        System.out.println("Cleared Hashtable: " + scores);
    }
}
