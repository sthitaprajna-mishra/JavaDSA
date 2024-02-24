package com.udemy.codingminutes.section4;

public class ReplaceBits {
    public static int clearBitsInRange(int num, int i, int j) {
        int beforeMask = (~0)<<(j+1);
        int afterMask = ~((~0)<<i);
        return num & (beforeMask | afterMask);
    }

    public static void func(int n, int m, int i, int j) {
        int updatedN = clearBitsInRange(n, i, j);
        System.out.println(updatedN | (m<<i));
    }
}
