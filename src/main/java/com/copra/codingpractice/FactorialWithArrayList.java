package com.copra.codingpractice;

import java.util.ArrayList;
import java.util.List;

public class FactorialWithArrayList {

    public static void main(String[] args){
    List<Long> list  = factorialNumbers(10);
    System.out.println(list.toString());

    }

    public static List<Long> factorialNumbers(long n) {
        List<Long> list = new ArrayList<>();
        recursiveFact(list, n);
        return list;
    }

    public static long recursiveFact(List<Long> list, long n) {

        if(n == 1){
            list.add(1L);
            return 1;
        }
        else{
            long result = n * recursiveFact(list, n - 1);
            list.add(result);
            return result;
        }

    }
}
