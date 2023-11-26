package com.copra.multithreading;

class MainClass extends Thread {
    public static Thread thread1;
    public static Thread thread2;

    public static void main(String arg[]) {
        thread1 = new MainClass();

        // thread1 is just created so now it is in NEW state
        System.out.println("Getting the state of thread1 after creation of thread1 = " +
                thread1.getState());

        thread1.start();

        // Start() method moved the thread1 to RUNNABLE state
        System.out.println("Getting the state of thread1 after call start method by thread1 = "
                + thread1.getState());
    }

    public void run() {
        thread2 = new ExampleOfThreadStates();

        // thread2 is just created so now it is in NEW state
        System.out.println("Getting the state of thread2 after creation of thread2 = " +
                thread2.getState());

        thread2.start();

        // Start() method moved the thread2 to RUNNABLE state
        System.out.println("Getting the state of thread2 after call start method by thread2 = " + thread2.getState());

        try {
            // The sleep method move the thread2 in TIMED_WAITING and thread1 in RUNNABLE.
            // Because sleep method is used to sleep the current executing thread.
            Thread.sleep(500);
            System.out.println("Getting the state of thread1 after call the sleep method = " +
                    thread1.getState());
            System.out.println("Getting the state of thread2 after call the sleep method = " +
                    thread2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            // Now join method is called by use of thread2 it means thread1 can't be execute
            // until thread2 execute completely.
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Getting the state of thread1 after completion of thread2 = " +
                thread1.getState());
        System.out.println("Getting the state of thread2 after completion of thread2 = " +
                thread2.getState());

    }

}
