package com.copra.BasicsCoding;

import java.util.Arrays;

public class ApplicationCoding {

    public static void main(String[] args) {


        //swapping logic...
        palindromCheck();
        numberPalindromeCheck();
        reverseString();
        fibonacciSeries();

        //recursion
        fibRecursion();
        factorialCalculation();


    }

    private static void fibRecursion() {
        int n = 7;
        System.out.println("sum of fibonacci : "+fibonacci(n));
        for(int i  = 0; i < n ; i ++ ){
            System.out.print(fibonacci(i) + "  ");
        }
        System.out.println();

    }

    private static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 2) + fibonacci(i - 1);
        }
    }

    private static void fibonacciSeries() {
        // 0 1 1 2 3 5
        int n = 8;
        int second = 1;
        int first = 0;
        System.out.println("fibonacci series : ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(first + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println();
    }

    private static void factorialCalculation() {

        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = i * fact;
        }
        System.out.println("factorial without recursion : " + fact);

        int factorial = factRecursion(num);
        System.out.println("using recusrion : " + factorial);
    }

    private static int factRecursion(int num) {

        if (num == 1 || num == 0) {
            return num;
        } else {
            return num * factRecursion(num - 1);
        }
    }

    private static void reverseString() {

        String s = "Amit";
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            char c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void numberPalindromeCheck() {

        int no = 4322343;
        int matcher = no;
        int n = 0;

        while (no > 0) {
            int temp = no % 10;
            n = n * 10 + temp;
            no /= 10;
        }
        System.out.println("is number palindrom : " + (matcher == n));
    }

    private static void palindromCheck() {

        String s = "ammamma";
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = false;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                isPalindrome = true;
            }
            left++;
            right--;
        }
        System.out.println("is Palindrome : " + isPalindrome);
    }


}
