package com.sthmishra.multithreading.multiples;

public class Client {
    public static void main(String[] args) {
        CustomThread ct1 = new CustomThread("One");
        CustomThread ct2 = new CustomThread("Two");
        CustomThread ct3 = new CustomThread("Three");

        ct1.t.start();
        ct2.t.start();
        ct3.t.start();

        System.out.println("Thread One is alive? " + ct1.t.isAlive());
        System.out.println("Thread Two is alive? " + ct2.t.isAlive());
        System.out.println("Thread Three is alive? " + ct3.t.isAlive());

        try {
            ct1.t.join();
            ct2.t.join();
            ct3.t.join();
        } catch(InterruptedException ex) {
            System.out.println("Main thread exception" + ex);
        }

        System.out.println("Thread One is alive? " + ct1.t.isAlive());
        System.out.println("Thread Two is alive? " + ct2.t.isAlive());
        System.out.println("Thread Three is alive? " + ct3.t.isAlive());

        System.out.println("Main thread exiting...");

    }
}
