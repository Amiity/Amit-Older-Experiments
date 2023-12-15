package com.copra.recursion;

public class PrintNumbers {

    public static void main(String[] args) {
        
        printNumber(5);

    }

    private static void printNumber(int i) {

        if(i <= 0){
            return;
        }
        printNumber(i-1);
        System.out.println(i);
    }

}
