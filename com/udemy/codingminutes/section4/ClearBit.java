package com.udemy.codingminutes.section4;

public class ClearBit {
    public static int func(int num, int i) {
        int mask = ~(1<<i);
        return num & mask;
    }
}
