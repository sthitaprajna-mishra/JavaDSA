package com.sthmishra.java8.streams.devgenius;

// Given the list of integers, find the first element of the list using Stream functions?

import java.util.*;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();// Arrays.asList(10,15,8,49,25,98,98,32,15);

        // method 1
        Optional<Integer> firstElement = myList.stream().findFirst();
        System.out.println(firstElement.orElse(-1));

        // method 2
        int result = myList.stream().findFirst().orElse(-1);
        System.out.println(result);
    }
}
