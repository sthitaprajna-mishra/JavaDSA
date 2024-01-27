package com.sthmishra.java8.interview;

import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 4, 5, 6);

        Optional<Integer> sum = l1.stream().reduce(Integer::sum);
        System.out.println("SUM: " + sum.get());
    }
}
