package com.copra.codingpractice;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int number =0;
        while(n > 0) {

            int temp = n % 10;
            number += temp*temp*temp;
            n /= 10;

        }

        boolean result =  (number==x);
        System.out.println(result);


    }
}
