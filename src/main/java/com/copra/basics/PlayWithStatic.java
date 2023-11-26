package com.copra.basics;

public class PlayWithStatic {

    public static void main(String[] args) {
        System.out.println(Anything.i);

        Anything a1 = new Anything();
        System.out.println(a1.i);
        a1.i = 54;
        System.out.println(a1.i);
        Anything a2 = new Anything();
        a2.i = 67;
        System.out.println(a2.i);
        System.out.println(a1.i);



    }
}

class Anything {

     static int i=63;

}
