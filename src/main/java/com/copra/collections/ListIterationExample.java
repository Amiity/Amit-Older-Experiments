package com.copra.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterationExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Method 1: Using For-Each Loop
        System.out.println("Method 1: Using For-Each Loop");
        for (String s : names){
            System.out.println(s);
        }


        // Method 2: Using For-Each Loop with Lambda Expression (Java 8+)
        System.out.println("Method 2: Using For-Each Loop with Lambda Expression (Java 8+)");
        names.forEach(name -> System.out.println(name));

        // Method 2: Using For-Each Loop with Lambda Expression method reference(Java 8+)
        names.forEach(System.out::println);

        // Method 3: Using Iterator
        System.out.println("Method 3: Using Iterator");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Method 4: Using ListIterator (for both forward and backward)
        System.out.println("Method 4: Using ListIterator (forward)");
        ListIterator<String> listIterator = names.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Method 4: Using ListIterator (backward)");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // Method 5: Using traditional for loop
        System.out.println("Method 5: Using traditional for loop");
        for (int i= 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }
    }
}

