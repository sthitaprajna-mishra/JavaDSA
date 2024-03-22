package com.sthmishra.java8.predicate.practice;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(12));

        Predicate<Integer> greaterThan10 = x -> x > 10;
        System.out.println(greaterThan10.test(20));

        // OR
        System.out.println(isEven.or(greaterThan10).test(6));

        // AND
        System.out.println(isEven.and(greaterThan10).test(6));

    }
}
