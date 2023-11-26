package com.copra.codingpractice;

public class SumOfAllDivisor {

    public static void main(String [] args){
        int n = sumOfAllDivisors(5);
        System.out.println(n);
    }
    public static int sumOfAllDivisors(int n){

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            for(int j = 1 ; j <= i; j++){

                if(i%j == 0){
                    sum += j;
                }

            }
        }
        return sum;

    }
}
