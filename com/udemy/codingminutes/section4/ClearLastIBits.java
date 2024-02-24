package com.udemy.codingminutes.section4;

public class ClearLastIBits {
    public static void func(int num, int i) {
        int mask = (~0) << i;
        System.out.println(num & mask);
    }
}
