package com.copra.BasicsCoding;

import java.util.Arrays;

public class reverseString {

    public static void main(String[] args) {


        String s = "Amit";
        String s2 = s;

        int start = 0;
        int end = s.length() - 1;
        char[] chr = s.toCharArray();
        while (start < end) {
            char c = chr[start];
            chr[start] = chr[end];
            chr[end] = c;
            start++;
            end--;
        }

        System.out.println(new String(chr).equals(""));

        System.out.println("hhkkb");

        String s3 = "abbbba";
        int i = 0, j = s3.length() - 1;
        boolean isPalindrom = true;
        System.out.println("889");
        while (i < j) {
            if (s3.charAt(i) != s3.charAt(j)) {
                isPalindrom = false;
            }
            i++;
            j--;
        }
        System.out.println("-> " + isPalindrom);
    }
}
