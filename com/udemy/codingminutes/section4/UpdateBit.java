package com.udemy.codingminutes.section4;

public class UpdateBit {
    public static void func(int num, int i, int bit) {
        if(bit != 1 && bit != 0) return;
        if(bit == 1) {
            int mask = (1<<i);
            System.out.println(num | mask);
        } else {
            int mask = ~(1<<i);
            System.out.println(num & mask);
        }
    }
}
