package com.copra.multithreading;

public class WaitNotify implements Runnable {
    int total = 0;

    public static void main(String[] args) throws InterruptedException {

        WaitNotify wn = new WaitNotify();
        Thread t1 = new Thread(wn);
        t1.start();
        synchronized (wn) {
            wn.wait();
            System.out.println("total : " + wn.total);
        }


    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                total = total + 100;
                notify();
            }
        }
    }
}
