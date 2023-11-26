package com.copra.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


 /*
add(): Adds elements to the LinkedList.
get(): Accesses elements by index.
set(): Modifies an element at a specific index.
remove(): Removes an element by index.
contains(): Checks if a specific element exists in the LinkedList.
indexOf(): Finds the index of a specific element.
size(): Gets the size (number of elements) of the LinkedList.
listIterator(): Iterates through the LinkedList using a ListIterator.
Reversing the LinkedList using both copying and addFirst().
clear(): Removes all elements from the LinkedList.
*/


public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Printing the LinkedList
        System.out.println("LinkedList: " + names);

        // Accessing elements by index
        String firstElement = names.get(0);
        System.out.println("First element: " + firstElement);

        // Modifying an element
        names.set(2, "Eve");
        System.out.println("Modified LinkedList: " + names);

        // Removing an element
        names.remove(1);
        System.out.println("LinkedList after removing an element: " + names);

        // Checking if an element exists in the LinkedList
        boolean containsCharlie = names.contains("Charlie");
        System.out.println("LinkedList contains 'Charlie': " + containsCharlie);

        // Finding the index of an element
        int index = names.indexOf("David");
        System.out.println("Index of 'David': " + index);

        // Getting the size of the LinkedList
        int size = names.size();
        System.out.println("Size of LinkedList: " + size);

        // Iterating through the LinkedList using a ListIterator
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Reversing the LinkedList
        LinkedList<String> reversed = new LinkedList<>(names);
        LinkedList<String> reversed2 = new LinkedList<>();
        for (String name : names) {
            reversed2.addFirst(name);
        }
        System.out.println("Reversed LinkedList (Using LinkedList copy): " + reversed);
        System.out.println("Reversed LinkedList (Using addFirst): " + reversed2);

        // Clearing the LinkedList
        names.clear();
        System.out.println("Cleared LinkedList: " + names);
    }
}
