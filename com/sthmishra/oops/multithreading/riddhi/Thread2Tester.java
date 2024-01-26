package com.sthmishra.oops.multithreading.riddhi;

public class Thread2Tester {
    public static void main(String[] args) {
        Runnable runner = new Thread2();
        Thread t2 = new Thread(runner, "custom-thread2");
        t2.start();
    }
}
