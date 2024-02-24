package com.udemy.codingminutes.section4;

public class CountOfSetBits {
    public static int func(int num) {
        int counter = 0;
        while(num != 0) {
            counter += (num&1);
            num = num>>1;
        }
        return counter;
    }
}
