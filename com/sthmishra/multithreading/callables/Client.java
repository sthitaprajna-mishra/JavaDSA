package com.sthmishra.multithreading.callables;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(8, 1, 6, 2, 3, 9, 7, 5);
        ExecutorService es = Executors.newCachedThreadPool();

        Future<List<Integer>> resultFuture = es.submit(new Sorter(arr, es));
        List<Integer> result = new ArrayList<>();

        try {
            result = resultFuture.get();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(result.toString());
    }
}
