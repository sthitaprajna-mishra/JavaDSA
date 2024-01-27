package com.sthmishra.java8.defaultmethods;

public interface A {
    default void m1() {
        System.out.println("inside interface A");
    }
}
