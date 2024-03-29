package com.sthmishra.multithreading.semaphores.diningphilosopher;

import java.util.concurrent.Semaphore;

public class Philosopher {
    private Semaphore sem;
    private boolean isFull = false;
    public String name;

    Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    public void startDining() {
        try {
            if(!isFull) {
                sem.acquire();
                System.out.println(name + " starts dining");

                Thread.sleep(500);
                isFull = true;

                System.out.println(name + " finished dining");
                sem.release();

                Thread.sleep(500);
            }
        } catch(InterruptedException ex) {
            System.out.println("Oops! Something went wrong...");
            System.out.println(ex.getMessage());
        }
    }

}
