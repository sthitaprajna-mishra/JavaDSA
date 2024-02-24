package com.udemy.codingminutes.section4;

public class PowerOf2 {
    public static boolean func(int num) {
        if((num & (num-1)) == 0) {
            System.out.println("Power of 2");
            return true;
        }
        System.out.println("Not a power of 2");
        return false;
    }
}
