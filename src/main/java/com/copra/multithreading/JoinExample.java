package com.copra.multithreading;

import static java.lang.Thread.currentThread;

public class JoinExample implements Runnable {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new JoinExample(), "t1");
        Thread t2 = new Thread(new JoinExample(), "t2");
        Thread t3 = new Thread(new JoinExample(), "t3");
        System.out.println("thread name : " + currentThread().getName());
        t1.start();
        t2.start();
        t3.start();

        t2.join();
        t1.join();
        t3.join();


        //It will execute in the last since its belongs to main thread
        System.out.println("Hey Bye");


    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("thread name : " + currentThread().getName() + " value of i : " + i);
        }

    }
}
