package com.sthmishra.multithreading.semaphores.example1;

import java.util.concurrent.Semaphore;

public class ConcurrentTask implements Runnable {
    private Semaphore semaphore;
    private int id;

    ConcurrentTask(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(); // allow only 2 threads
            System.out.println("Thread " + Thread.currentThread().getName() + " started work on task " + id + "...");
            // simulating work
            Thread.sleep(2000);
            System.out.println("Thread " + Thread.currentThread().getName() + " finished work on task " + id);
        }
        catch(InterruptedException e) {
            System.out.println("Oops!");
            System.out.println(e.getMessage());
        }
        finally {
            semaphore.release();
        }
    }
}
