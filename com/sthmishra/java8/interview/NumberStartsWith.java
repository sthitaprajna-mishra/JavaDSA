package com.sthmishra.java8.interview;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWith {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(11,2,32,45,27,9,20,256,832,224);

        List<Integer> l2 = l1.stream().filter(e->e.toString().charAt(0)=='2').toList();
        System.out.println(l2);
    }
}
