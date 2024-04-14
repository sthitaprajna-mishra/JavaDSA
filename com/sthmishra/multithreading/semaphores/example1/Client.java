package com.sthmishra.multithreading.semaphores.example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(20);
        Semaphore semaphore = new Semaphore(2);

        for(int i = 1; i <= 10; i++) {
            ConcurrentTask task = new ConcurrentTask(semaphore, i);
            es.execute(task);
        }

        es.shutdown();
    }
}
