package com.copra.BasicsCoding;

import java.util.Arrays;

public class StringOperations {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(", ").concat(str2);

        //Concatenation (concat method):
        System.out.println(str3);


        //Substring (substring method):
        System.out.println(str3.substring(7));
        System.out.println(str3.substring(0, 5));

        String str = "Hello, World!";
        int index = str.indexOf('W'); // Returns 7
        int lastIndex = str.lastIndexOf('l'); // Returns 10

        System.out.println(index);
        System.out.println(lastIndex);

        System.out.println(str.contains("ello"));

        String str4 = "Hello, World!";
        String replaced = str4.replace("Hello", "Hi"); // Returns "Hi, World!"

        String str5 = "apple,orange,banana";
        String[] parts = str5.split(",");
        System.out.println(Arrays.toString(parts));


    }


}

