package com.copra.codingpractice;

public class CalculateGCD {

    public static void main(String[] args) {

        /*int num = calcGCD(52,18);
        System.out.println(num);*/

        int num2 = calcGCD2(18,52);
        System.out.println(num2);
    }

    public static int calcGCD(int n, int m) {


        int no = 0;
        if (n > m) {
            no = m;
        } else {
            no = n;
        }


        for (int i = no; i >= 1; i--) {

            if (n % i == 0 && m % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int calcGCD2(int a, int b){

        while(a > 0 && b > 0){
            if(a > b) {
                a %= b ;
            }else{
                b %= a;
            }

        }
        return (a == 0) ? b : a;

    }

}
