package com.copra.multithreading;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Task1());
        executorService.submit(new Thread(new Task2()));

        System.out.println("main executed");
    }


}

class Task1 extends Thread {

    @Override
    public void run() {
        System.out.println("\nTask1 Started");
        for (int i = 0; i < 200; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask2 Started");
        for (int i = 0; i < 200; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\nTask2 Done");
    }
}
