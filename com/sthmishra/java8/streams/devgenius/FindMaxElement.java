package com.sthmishra.java8.streams.devgenius;

// Given a list of integers, find the maximum value element present in it using Stream functions?

import java.util.*;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Optional<Integer> maxNum = myList.stream().max((i1,i2)->i1.compareTo(i2));
        System.out.println(maxNum.orElse(-1));
    }
}
