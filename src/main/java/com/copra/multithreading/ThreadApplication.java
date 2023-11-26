package com.copra.multithreading;

public class ThreadApplication {

    public static void main(String[] args) {
        System.out.println("Starts main thread");

        // Creates Thread by extending Thread class and overriding 'run' method
        Thread1 t1 = new Thread1();
        // t1.setDaemon(true); JVM doesn't look for main thread
        t1.start();

        // Creates Thread by implmenting Runnable interface by passing object of Thread2Runnable
        Thread t2 = new Thread(new Thread2Runnable());
        t2.start();

        System.out.println("Ends main thread");
    }
}
