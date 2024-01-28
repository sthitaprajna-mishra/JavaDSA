package com.sthmishra.java8.streams.devgenius;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.*;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        // store it in a list
        List<Integer> result = myList.stream().filter(i->i.toString().charAt(0)=='1').collect(Collectors.toList());

        // print output
        myList.stream().filter(i->i.toString().charAt(0)=='1').forEach(System.out::println);
    }
}
