package com.copra.multithreading;

import java.util.concurrent.*;

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new CallableTask("Initalize stirng of callable"));
        String message = future.get();
        System.out.println(message);
    }
}


class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        //Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        return "callable methods call";
    }
}
