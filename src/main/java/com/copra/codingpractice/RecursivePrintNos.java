package com.copra.codingpractice;

public class RecursivePrintNos {
    public static void main(String[] args) {
        int x = 5;

        // Generate and print the array using recursion
        int[] array = printNos(x);
        System.out.println(array.toString());
    }

    // Recursive method to generate an array from 1 to x
    public static int[] printNos(int x) {

        int[] n = new int[x];
        if(x>0){
            n[x-1] = x;
            printNos(x-1);
        }
        return n;

    }


}

