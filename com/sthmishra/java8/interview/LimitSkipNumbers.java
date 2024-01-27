package com.sthmishra.java8.interview;

import java.util.Arrays;
import java.util.List;

public class LimitSkipNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

        // get 5 first numbers -> sum them

        // method 1
        int sumOfFirst5 = l1.stream().limit(5).mapToInt(e->e).sum();
        System.out.println(sumOfFirst5);

        // method 2
        sumOfFirst5 = l1.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(sumOfFirst5);

        // skip the first 5 numbers
        List<Integer> skipped = l1.stream().skip(5).toList();
        System.out.println(skipped);
    }
}
