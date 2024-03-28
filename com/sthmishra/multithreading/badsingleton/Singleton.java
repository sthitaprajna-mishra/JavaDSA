package com.sthmishra.multithreading.badsingleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized(Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                    System.out.println("New singleton instance created by thread " + Thread.currentThread().getName());
                }
            }
        }
        return uniqueInstance;
    }
}
