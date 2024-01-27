package com.sthmishra.java8.predicate;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String[] args) {
        Predicate<String> p = (str)->str.length()>5;
        System.out.println(p.test("Hello"));
        System.out.println(p.test("Goodnight"));

    }
}
