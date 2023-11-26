package com.copra.codingpractice;

public class Palindrom {

    public static  void main(String [] args){

        boolean x = Palindrom.isPalindrome(101);
        System.out.println(x);
    }
   public static boolean isPalindrome(int x) {

            if(x < 0){
                return false;
            }

            int num = 0;
            int temp = x;

            while (temp != 0){

                int digit  = temp % 10;
                num = num * 10 + digit;
                temp = temp /10;

            }

            return (num == x);

    }
}
