package com.sthmishra.java8.predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {
    public static void main(String[] args) {
        Predicate<Integer> p = (a)-> a > 20;

        System.out.println(p.test(20));
    }
}
