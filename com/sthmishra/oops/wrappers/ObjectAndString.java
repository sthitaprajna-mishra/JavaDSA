package com.sthmishra.oops.wrappers;

public class ObjectAndString {
    public static void main(String[] args) {
        long x = 1000L;
        Long y = Long.valueOf(x);
        String result = y.toString();
        Long z = Long.valueOf(result);
    }
}
