package com.udemy.codingminutes.section4.scaler;

public class RepeatingTwiceExceptOne {
    public static int func(int[] arr) {
        int ans = 0;
        for(int el : arr) ans = ans ^ el;
        return ans;
    }
}
