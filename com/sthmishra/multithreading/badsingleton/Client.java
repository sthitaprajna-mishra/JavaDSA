package com.sthmishra.multithreading.badsingleton;

public class Client {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton.getInstance();
        }, "thread1");
        Thread t2 = new Thread(() -> {
            Singleton.getInstance();
        }, "thread2");
        Thread t3 = new Thread(() -> {
            Singleton.getInstance();
        }, "thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
