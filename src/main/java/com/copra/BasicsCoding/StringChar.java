package com.copra.BasicsCoding;

public class StringChar {

    public static void main(String[] args) {

        String str = "Amit";
        char[] ch = str.toCharArray();

        String s = new String(ch);
        System.out.println(ch);
        System.out.println(str.charAt(2));
        System.out.println(s.equals(ch));

        char c = 'H';
        String charToString = Character.toString(c); // Converts 'H' to "H"




    }
}
