package com.copra.codingpractice;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] a = {2, 4, 1, 4, 2, 5, 7, 5, 1, 8, 6, 3, 2};
        Set<Integer> set = new HashSet<>();

        //Using set
        for (int element : a) {
            set.add(element);
        }
        System.out.println(set.toString());

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(4);
        lst.add(2);
        lst.add(1);

        System.out.println(removeDuplicates(lst, 4));

        Set<Integer> set1 = new HashSet<>();
        int val = lst.stream()
                .filter(n -> !set1.add(n)) // If element cannot be added to set, it's a duplicate
                .findFirst() // Find the first duplicate
                .orElse(0); // Return 0 if no duplicates found
        System.out.println(val);


        Set<Integer> set2 = new HashSet<>();
        for (Integer element: lst
             ) {

            System.out.print("  "+set2.add(element));

        }
    }


    public static int removeDuplicates(ArrayList<Integer> arr, int n) {

        Set<Integer> set = new HashSet<>();

        for (Integer a : arr) {
            set.add(a);
        }
        return set.size();

    }
}
