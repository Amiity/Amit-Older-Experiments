package com.copra.basics;

public class PlayWithFinal {
    final int constantValue;

    public PlayWithFinal(int value) {
        this.constantValue = value;
    }

    public static void main(String[] args) {
        PlayWithFinal obj1 = new PlayWithFinal(10);
        PlayWithFinal obj2 = new PlayWithFinal(20);

        System.out.println(obj1.constantValue); // Prints 10
        System.out.println(obj2.constantValue); // Prints 20
    }
}

