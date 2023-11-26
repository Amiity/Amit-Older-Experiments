package com.copra.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultipleCallableRunner {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Single thread
        //ExecutorService executorService = Executors.newFixedThreadPool(1);
        //Multiple threads
        ExecutorService executorService = Executors.newFixedThreadPool(230);
        ArrayList<CallableTask1> al = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
            al.add(new CallableTask1("a" + i + ""));
        }
        //List<CallableTask1> callableTask1List = List.of(new CallableTask1("Hi Amit"), new CallableTask1("Hi Anoop"), new CallableTask1("Hi Alok"), new CallableTask1("Hi Abhay"), new CallableTask1("Hi Dev"));
        List<CallableTask1> callableTask1List = al;
        List<Future<String>> futureList = executorService.invokeAll(callableTask1List);
        executorService.shutdown();

        for (Future<String> future : futureList) {

         //   System.out.println("Message from User : " + future.get());

        }
    }
}


class CallableTask1 implements Callable<String> {

    private String name;

    public CallableTask1(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        //Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        return name;
    }
}

