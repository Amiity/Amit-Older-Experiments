package com.copra.multithreading;

import static java.lang.Thread.currentThread;

public class Thread2Runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread : " + currentThread().getName() + " value of i : " + i);

        }
    }
}