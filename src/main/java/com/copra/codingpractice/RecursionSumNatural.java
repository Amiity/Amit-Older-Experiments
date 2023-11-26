package com.copra.codingpractice;

public class RecursionSumNatural {

    public static  void main(String [] args){

        sumFirstN(5);
    }

    public static void sumFirstN(long n) {

        long sum = 0;
        long ans = recursiveCall(n, sum);
        System.out.println(ans);

    }

    public static long recursiveCall(long n , long sum){
        if(n>0){
            sum += n;
           return recursiveCall(n-1, sum);
        }else {
            return sum;
        }
    }
}
