package com.udemy.codingminutes.section4;

public class FastExponentiation {
    public static int func(int num, int exponent) {
        int result = 1;

        while(exponent > 0) {
            if((exponent&1) > 0) {
                result *= num;
            }
            num *= num;
            exponent >>= 1;
        }

        return result;
    }
}
