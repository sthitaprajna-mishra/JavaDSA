package com.sthmishra.multithreading.semaphores.diningphilosopher;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class DiningTable {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<String> philosopherNames = Arrays.asList(
                "Chanakya",
                "Aryabhatta",
                "Adi Shankaracharya",
                "Swami Vivekananda",
                "Gautama Buddha");

        for(String philosopherName : philosopherNames) {
            executorService.execute(() -> {
                new Philosopher(sem, philosopherName).run();
            });
        }

        executorService.shutdown();
    }
}
