package com.copra.multithreading;

class ExampleOfThreadStates extends Thread {
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting the state of thread1 after calling the join by thread2 = "+  MainClass.thread1.getState());
            System.out.println("Getting the state of thread2 after calling the join by thread2 = "+  MainClass.thread2.getState());
    }
}