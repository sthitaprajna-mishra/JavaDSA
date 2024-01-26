package com.sthmishra.oops.multithreading;

public class ThreadPriorityDemo extends Thread {

    public static void main(String[] args) {
        ThreadPriorityDemo mt = new ThreadPriorityDemo();
        mt.setPriority(MIN_PRIORITY);
        mt.setName("mt");
        mt.start();

        ThreadPriorityDemo mt1 = new ThreadPriorityDemo();
        mt1.setPriority(MAX_PRIORITY);
        mt1.setName("mt1");
        mt1.start();

        ThreadPriorityDemo mt2 = new ThreadPriorityDemo();
        mt2.setPriority(NORM_PRIORITY);
        mt2.setName("mt2");
        mt2.start();
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
