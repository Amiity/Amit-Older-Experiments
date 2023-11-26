package com.copra.Eight;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Integer[] arr = new Integer[5];

        for (int i = 0; i < arr.length - 1; i++) {

            //getting null pointer error
        /*    String change = arr[i].toString();
            System.out.println(arr[i]);*/

            Optional<Integer> opt = Optional.ofNullable(arr[i]);
            if (opt.isPresent()) {
                String change = arr[i].toString();
                System.out.println(arr[i]);
            }

            String s2 = null;
           // Optional<String> opt2 = Optional.of(s2);
           // System.out.println(opt2.isPresent());

            String s1 = null;
            Optional<String> opt3 = Optional.ofNullable(s1);
            String result = opt3.orElse("Default Value");
            System.out.println("Result: " + result);


        }
    }
}
