package com.udemy.codingminutes.section4.scaler;

public class RepeatingThriceExceptOne {
    public static int func(int[] arr) {
        int count = 0, ans = 0;
        for(int i = 0; i < 32; i++) {
            count = 0;
            for(int el : arr) {
                if((el&(1<<i)) > 0) {
                    count++;
                }
            }
            if(count%3 != 0) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
}
