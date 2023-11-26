package com.copra.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
add(): Adds elements to the ArrayList.
get(): Accesses elements by index.
set(): Modifies an element at a specific index.
remove(): Removes an element by index.
contains(): Checks if a specific element exists in the ArrayList.
indexOf(): Finds the index of a specific element.
size(): Gets the size (number of elements) of the ArrayList.
Collections.sort(): Sorts the ArrayList in ascending order.
Collections.reverse(): Reverses the order of elements in the ArrayList.
clear(): Removes all elements from the ArrayList.
*/

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(42);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Printing the ArrayList
        System.out.println("ArraList : "+numbers);

        // Accessing elements by index
        System.out.println("Third Element : "+numbers.get(2));

        // Modifying an element
        numbers.set(2,24);
        System.out.println("Modified ArrayList : "+numbers);

        // Removing an element
        numbers.remove(2);
        System.out.println("ArrayList after removing an element: "+numbers);

        // Checking if an element exists in the ArrayList
        boolean val = numbers.contains(40);
        System.out.println("ArrayList contains 40: " + val);

        // Finding the index of an element

        System.out.println("Index of 35: "+numbers.indexOf(24));

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: "+numbers.size());

        // Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: "+numbers);

        // Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: "+numbers);

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("Cleared ArrayList: "+numbers);
    }
}
