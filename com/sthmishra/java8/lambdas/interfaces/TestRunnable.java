package com.sthmishra.java8.lambdas.interfaces;

public class TestRunnable {
    public static void main(String[] args) {
//        Runnable runner = new RunnableImp();
//        Thread t1 = new Thread(runner, "custom-thread");
//        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("inside " + Thread.currentThread().getName());
            for(int i = 1; i <= 10; i++) {
                System.out.print(i + " -- ");
            }
        }, "custom-thread-2");
        t2.start();
    }
}
