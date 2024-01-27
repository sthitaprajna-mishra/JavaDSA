package com.sthmishra.java8.interview;

import java.util.*;

public class NumberSquareAverage {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,10,20,30,15);

        List<Integer> result = l1.stream().map(e -> (int)Math.pow(e, 2)).filter(e->e>100).toList();
        System.out.println(result);

        double avg = l1.stream().map(e -> (int)Math.pow(e, 2)).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
