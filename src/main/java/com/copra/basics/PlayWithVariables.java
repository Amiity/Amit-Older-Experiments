package com.copra.basics;

public class PlayWithVariables {

    int age;
    String name;
    static final String collegeName = "PSIT";
    //static String collegeName;
    void testingLocalVar() {
        int n = 0;
        System.out.print(n);
    }


    public static void main(String[] args) {

        PlayWithVariables var1 = new PlayWithVariables();
        var1.age = 5;
        var1.name = "Abhay";
        //PlayWithVariables.collegeName = "IT-BHU";
        System.out.println(var1.age);
        System.out.println(var1.name);
        System.out.println(PlayWithVariables.collegeName);
        System.out.println(collegeName);

        PlayWithVariables var2 = new PlayWithVariables();
        var2.age = 6;
        var2.name = "Alok";
        //PlayWithVariables.collegeName = "IIT-K";
        System.out.println(var2.age);
        System.out.println(var2.name);
        System.out.println(PlayWithVariables.collegeName);
        System.out.println(collegeName);


    }
}
