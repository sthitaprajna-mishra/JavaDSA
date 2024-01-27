package com.sthmishra.java8.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int[] x = {0,7,10,20,30,40,50,60,70,73};

        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i%2==0;

        System.out.println("Greater than 10: ");
        PredicateJoins.method1(p1, x);

        System.out.println("\nNot Greater than 10: ");
        PredicateJoins.method1(p1.negate(), x);

        System.out.println("\nEven numbers: ");
        PredicateJoins.method1(p2, x);

        System.out.println("\nGreater than 10 AND Even numbers: ");
        PredicateJoins.method1(p2.and(p1), x);

        System.out.println("\nGreater than 10 OR Even numbers: ");
        PredicateJoins.method1(p2.or(p1), x);
    }

    public static void method1(Predicate<Integer> p, int[] arr) {
        for(int el : arr) {
            if(p.test(el)) System.out.print(el + "\t");
        }
    }
}
