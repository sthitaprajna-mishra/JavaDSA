package com.sthmishra.oops.wrappers;

public class PrimitiveAndString {
    public static void main(String[] args) {
        byte x = 100;
        String y = Byte.toString(x);
        byte z = Byte.parseByte(y);
    }
}
