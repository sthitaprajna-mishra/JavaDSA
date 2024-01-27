package com.sthmishra.java8.interview;

import java.util.Arrays;
import java.util.List;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(11,2,3,45,67,9,90,87,8,2);

        List<Integer> l2 = l1.stream().filter(e->e%2==0).toList();
        System.out.println(l2);

        List<Integer> l3 = l1.stream().filter(e->e%2!=0).toList();
        System.out.println(l3);
    }
}
