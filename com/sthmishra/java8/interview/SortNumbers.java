package com.sthmishra.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

        List<Integer> sortedList = l1.stream().sorted((e1,e2)->e2-e1).toList();
        System.out.println(sortedList);
    }
}
