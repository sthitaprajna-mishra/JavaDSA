package com.udemy.codingminutes.section4;

public class CheckOddEven {
    public static String func(int num) {
        return (num & 1) == 1 ? "Odd" : "Even";
    }
}
