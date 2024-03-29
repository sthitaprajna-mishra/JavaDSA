package com.sthmishra.multithreading.semaphores.diningphilosopher;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class DiningTable {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        List<String> philosopherNames = Arrays.asList(
                "A", "B", "C", "D", "E");

        Semaphore sem = new Semaphore(2);


        for(String name : philosopherNames) {
            fixedThreadPool.execute(() -> {
                new Philosopher(sem, name).startDining();
            });
        }

    }
}
