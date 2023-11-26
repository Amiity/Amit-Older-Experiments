package com.copra.basics;

public class PlayWithConstructor {

    static String cardNumber;

    PlayWithConstructor(String number) {
        cardNumber = number;
    }

    void printCardNumber() {
        System.out.println(cardNumber);
    }

    public static void main(String[] args) {
         PlayWithConstructor playWithConstructor = new PlayWithConstructor("5314-2112-3311-1212");
        playWithConstructor.printCardNumber();
    }
}
