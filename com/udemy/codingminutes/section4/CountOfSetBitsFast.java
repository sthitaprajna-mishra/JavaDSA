package com.udemy.codingminutes.section4;

public class CountOfSetBitsFast {
    public static int func(int num) {
        int count = 0;
        while(num > 0) {
            num = num & (num-1);
            count++;
        }
        return count;
    }
}
