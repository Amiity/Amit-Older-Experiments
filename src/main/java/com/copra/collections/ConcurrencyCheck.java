package com.copra.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcurrencyCheck {

    public static void main(String[] args) {

        // Example with ArrayList
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }

        // Using enhanced for loop to iterate through the list
        for (Integer number : numbers) {
         //   System.out.println(number);
          //  numbers.remove(number);
          //   numbers.add(number); // Modifying the list while iterating
        }

        Integer sum = numbers.stream().filter(num -> num%2==0).reduce(0, (a, num) -> a+num);
        System.out.println(sum);

    }
}




