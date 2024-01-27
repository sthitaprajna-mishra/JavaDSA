package com.sthmishra.java8.lambdas.params;

import com.sthmishra.java8.lambdas.params.Sum;

public class Test {
    public static void main(String[] args) {
        Sum s = (x, y) -> System.out.println("Sum is " + (x+y));
        s.add(2, 3);
    }
}
