package com.udemy.codingminutes.section4;

public class ConvertDecimalToBinary {
    public static String func(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.insert(0, num%2);
            num /= 2;
        }
        return sb.toString();
    }
}
