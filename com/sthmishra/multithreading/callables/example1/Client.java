package com.sthmishra.multithreading.callables.example1;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(8, 1, 6, 4, 5, 2, 9, 7, 3);
        ExecutorService es = Executors.newCachedThreadPool();

        Future<List<Integer>> arrFuture = es.submit(new ConcurrentMergeSort(arr, es));
        List<Integer> result = new ArrayList<>();
        try {
            result = arrFuture.get();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(result.toString());
    }
}
