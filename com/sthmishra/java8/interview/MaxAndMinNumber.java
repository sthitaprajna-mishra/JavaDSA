package com.sthmishra.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

        Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
        int maxNum = l1.stream().max(comp).get();
        System.out.println(maxNum);

        int minNum = l1.stream().min(comp).get();
        System.out.println(minNum);
    }
}
