package com.sthmishra.multithreading.multiples;

public class CustomThread implements Runnable{
    public String name;
    public Thread t;

    public CustomThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    @Override
    public void run() {
        for(int i = 5; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " exiting");
    }
}
