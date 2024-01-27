package com.sthmishra.java8.interview;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 4, 5, 6);

        double avg = l1.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
