package com.sthmishra.multithreading.semaphores.diningphilosopher;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    private Semaphore sem;
    private boolean isFull = false;
    public String name;

    public Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            if(!isFull) {
                sem.acquire();
                System.out.println(name + " is now sitting down to eat");
                Thread.sleep(1000);
                // done eating, so now full
                isFull = true;
                // leave room for others
                System.out.println(name + " is finished");
                sem.release();
                Thread.sleep(1000);
            }
        } catch(InterruptedException ex) {
            System.out.println("Something went wrong...");
            System.out.println(ex.getMessage());
        }
    }
}
