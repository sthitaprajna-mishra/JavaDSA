package com.sthmishra.multithreading.callables.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ConcurrentMergeSort implements Callable<List<Integer>>  {
    private List<Integer> array;
    private ExecutorService es;

    ConcurrentMergeSort(List<Integer> array, ExecutorService es) {
        this.array = array;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(array.size() <= 1) {
            return array;
        }

        int totalSize = array.size();
        int mid = totalSize/2;

        List<Integer> leftArrayToBeSorted = new ArrayList<>();
        List<Integer> rightArrayToBeSorted = new ArrayList<>();

        for(int i = 0; i < mid; i++) {
            leftArrayToBeSorted.add(array.get(i));
        }

        for(int i = mid; i < totalSize; i++) {
            rightArrayToBeSorted.add(array.get(i));
        }

        Future<List<Integer>> leftArrFuture = es.submit(new ConcurrentMergeSort(leftArrayToBeSorted, es));
        Future<List<Integer>> rightArrFuture =  es.submit(new ConcurrentMergeSort(rightArrayToBeSorted, es));

        List<Integer> leftSortedArr = leftArrFuture.get();
        List<Integer> rightSortedArr = rightArrFuture.get();

        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < leftSortedArr.size() && j < rightSortedArr.size()) {
            if(leftSortedArr.get(i) <= rightSortedArr.get(j)) {
                sortedArray.add(leftSortedArr.get(i++));
            } else {
                sortedArray.add(rightSortedArr.get(j++));
            }
        }

        while(i < leftSortedArr.size()) {
            sortedArray.add(leftSortedArr.get(i++));
        }

        while(j < rightSortedArr.size()) {
            sortedArray.add(rightSortedArr.get(j++));
        }

        return sortedArray;
    }
}
