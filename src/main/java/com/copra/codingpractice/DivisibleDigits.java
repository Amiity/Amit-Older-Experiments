package com.copra.codingpractice;

import java.util.Scanner;

public class DivisibleDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        int result = countDivisibleDigits(n);
        System.out.println(result);
    }

    public static int countDivisibleDigits(long n) {
        int count = 0;

        while (n > 0) {
            long digit = n % 10;  // Extract the last digit
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            n /= 10;  // Remove the last digit
        }

        return count;
    }
}

