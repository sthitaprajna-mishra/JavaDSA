package com.sthmishra.java8.interview;

import java.util.*;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 30, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);
        Comparator<Integer> comp = (e1, e2)->e2-e1;
        Optional<Integer> secondHighest = list.stream().sorted(comp).distinct().skip(1).findFirst();
        System.out.println(secondHighest.orElse(-1));

        Optional<Integer> secondLowest = list.stream().sorted().distinct().skip(1).findFirst();
        System.out.println(secondLowest.orElse(-1));
    }
}
