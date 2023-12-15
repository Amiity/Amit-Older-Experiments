package com.copra.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }

    }

    private static int fibo(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
