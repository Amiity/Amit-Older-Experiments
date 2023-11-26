package com.copra.collections;

import java.util.HashSet;
import java.util.Set;

/*
add(): Adds elements to the Set.
Adding duplicate elements (no effect, as Sets don't allow duplicates).
contains(): Checks if a specific element exists in the Set.
remove(): Removes an element from the Set.
size(): Gets the size (number of elements) of the Set.
Iterating through the Set using a for-each loop.
Performing set operations (union, intersection, difference) using addAll(), retainAll(), and removeAll().
clear(): Removes all elements from the Set.
*/

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the Set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Printing the Set
        System.out.println("Set: " + numbers);

        // Adding duplicate elements (no effect, as Sets don't allow duplicates)
        numbers.add(20);
        System.out.println("Set after adding a duplicate element: " + numbers);

        // Checking if an element exists in the Set
        boolean contains30 = numbers.contains(30);
        System.out.println("Set contains 30: " + contains30);

        // Removing an element
        numbers.remove(20);
        System.out.println("Set after removing an element: " + numbers);

        // Getting the size of the Set
        int size = numbers.size();
        System.out.println("Size of Set: " + size);

        // Iterating through the Set
        System.out.print("Set elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Creating another Set for set operations
        Set<Integer> otherSet = new HashSet<>();
        otherSet.add(30);
        otherSet.add(50);

        // Performing set operations (union, intersection, difference)
        Set<Integer> union = new HashSet<>(numbers);
        union.addAll(otherSet);
        System.out.println("Union of Sets: " + union);

        Set<Integer> intersection = new HashSet<>(numbers);
        intersection.retainAll(otherSet);
        System.out.println("Intersection of Sets: " + intersection);

        Set<Integer> difference = new HashSet<>(numbers);
        difference.removeAll(otherSet);
        System.out.println("Difference of Sets: " + difference);

        // Clearing the Set
        numbers.clear();
        System.out.println("Cleared Set: " + numbers);
    }
}

