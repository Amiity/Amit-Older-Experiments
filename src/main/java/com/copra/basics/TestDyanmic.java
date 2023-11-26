package com.copra.basics;

public class TestDyanmic {


    public static void main(String[] args) {


        A a = new B();
        a.a();
        a.b();


    }

}

class A {

    void a() {
        System.out.println("A.a");
    }

    void b() {
        System.out.println("A.b");
    }

}

class B extends A {

    @Override
    void b() {
        System.out.println("B.b");
    }


    void c() {
        System.out.println("B.b");
    }


}
