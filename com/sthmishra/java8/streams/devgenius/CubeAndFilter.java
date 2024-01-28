package com.sthmishra.java8.streams.devgenius;

// Java 8 program to perform cube on list elements and filter numbers greater than 50.

import java.util.*;
import java.util.stream.Collectors;

public class CubeAndFilter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

        List<Integer> result = integerList.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
        System.out.println(result);
    }
}
