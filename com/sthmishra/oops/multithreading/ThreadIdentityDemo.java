package com.sthmishra.oops.multithreading;

public class ThreadIdentityDemo extends Thread {
    public static void main(String[] args) {
        ThreadIdentityDemo mt = new ThreadIdentityDemo();
        mt.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("Current thread name is: " + currentThread.getName());

    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
//        System.out.println("Current thread name is: " + currentThread.getName());
        currentThread.setName("custom run() method");
        System.out.println("Current thread name is: " + currentThread.getName());
    }
}
