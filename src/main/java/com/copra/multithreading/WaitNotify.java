package com.copra.multithreading;

public class WaitNotify implements Runnable {
    int total = 0;

    public static void main(String[] args) throws InterruptedException {

        WaitNotify wn = new WaitNotify();
        Thread t1 = new Thread(wn);
        t1.start();
        synchronized (wn) {
            System.out.println("Hey .. going on waiting state ...");
            wn.wait();
            System.out.println("Hey .. Recieved notification resuming ...");
            System.out.println("total : " + wn.total);
        }


    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                total = total + 100;
            }
            System.out.println("Before notification ...");
            notify();
            System.out.println("Sending .. Notification ..");
        }
    }
}
