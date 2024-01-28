package com.sthmishra.java8.streams.devgenius;

// How to find duplicate elements in a given integers list in java using Stream functions?

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        // store it in a list
        List<Integer> result = myList.stream().filter(i->Collections.frequency(myList, i)>1).distinct().collect(Collectors.toList());

        // print output
        myList.stream().filter(i->Collections.frequency(myList, i)>1).distinct().forEach(System.out::println);
    }
}
