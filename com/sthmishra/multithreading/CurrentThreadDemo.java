package com.sthmishra.multithreading;

// controlling the main thread
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Current thread: " + t);

        t.setName("MyThread");
        System.out.println("After update: " + t);

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
