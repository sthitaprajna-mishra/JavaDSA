package com.sthmishra.java8.streams.devgenius;

// Given a list of integers, sort all the values present in it using Stream functions?

import java.util.*;
import java.util.stream.Collectors;

public class SortValues {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        List<Integer> result = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
