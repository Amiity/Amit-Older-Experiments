package com.copra.BasicsCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNoSum {

    public static void main(String[] args) {

        List<Integer> a = List.of(1,4,21,4,1,4);

        int[] a1 = {2,1,4,21,4,1};

        int sumOfEven = a.stream().filter(num -> num%2==0).mapToInt(Integer::intValue).sum();

        int sum = Arrays.stream(a1).filter(num -> num%2==0).sum();
        System.out.println(sum);


        int summ = a.stream().filter(num -> num%2 == 0).reduce(0, (accu,b) -> accu+b);
        System.out.println(summ);



    }
}
