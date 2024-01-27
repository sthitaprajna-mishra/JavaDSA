package com.sthmishra.java8.interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

        Set<Integer> duplicates = l1.stream().filter(e->Collections.frequency(l1, e) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
