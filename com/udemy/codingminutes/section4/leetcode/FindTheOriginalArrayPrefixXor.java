package com.udemy.codingminutes.section4.leetcode;

public class FindTheOriginalArrayPrefixXor {
    public static int[] findArray(int[] pref) {
        int n = pref.length;
        int[] arr = new int[n];
        arr[0] = pref[0];
        for(int i = 1; i < n; i++) {
            int el = findOtherNum(pref[i-1], pref[i]);
            arr[i] = el;
        }
        return arr;
    }

    public static int findOtherNum(int a, int b) {
        // a ^ ? = b
        int i = 0, num = 0;
        while(a > 0 || b > 0) {
            int newBit = a&1;
            if((b&1) == 0) {
                num |= newBit<<i;
            } else {
                newBit = newBit == 1 ? 0 : 1;
                num |= newBit<<i;
            }
            a >>= 1;
            b >>= 1;
            i++;
        }

        return num;
    }

    public static void main(String[] args) {
        int[] pref = new int[] {5,2,0,3,1};
        int[] result = findArray(pref);
        for(int el : result) {
            System.out.println(el);
        }
    }
}
