package com.sthmishra.multithreading.callables;
import java.util.*;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService es;

    Sorter(List<Integer> arr, ExecutorService es) {
        this.arrayToSort = arr;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int size = arrayToSort.size();
        int mid = size/2;

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for(int i = 0;  i < mid; i++) {
            leftArr.add(arrayToSort.get(i));
        }

        for(int i = mid; i < size; i++) {
            rightArr.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArr, es);
        Sorter rightArraySorter = new Sorter(rightArr, es);

        Future<List<Integer>> LeftSortedArrayFuture = es.submit(leftArraySorter);
        Future<List<Integer>> RightSortedArrayFuture = es.submit(rightArraySorter);

        List<Integer> leftSortedArr = LeftSortedArrayFuture.get();
        List<Integer> rightSortedArr = RightSortedArrayFuture.get();

        int i = 0;
        int j = 0;

        List<Integer> sortedArr = new ArrayList<>();

        while(i < leftSortedArr.size() && j < rightSortedArr.size()) {
            if(leftSortedArr.get(i) <= rightSortedArr.get(j)) {
                sortedArr.add(leftSortedArr.get(i++));
            } else {
                sortedArr.add(rightSortedArr.get(j++));
            }
        }

        while(i < leftSortedArr.size()) {
            sortedArr.add(leftSortedArr.get(i++));
        }

        while(j < rightSortedArr.size()) {
            sortedArr.add(rightSortedArr.get(j++));
        }

        return sortedArr;
    }
}
