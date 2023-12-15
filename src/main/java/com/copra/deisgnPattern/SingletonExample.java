package com.copra.deisgnPattern;

public class SingletonExample {

    public static void main(String[] args) {

        SingletonClass s = SingletonClass.getInstance();

        SingletonClass s2  = SingletonClass.getInstance();

        System.out.println(s==s2);

    }
}

class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {

        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
