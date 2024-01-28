package com.sthmishra.java8.streams.devgenius;

//Given a list of integers, sort all the values present in it in descending order using Stream functions?

import java.util.*;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        List<Integer> result = myList.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(result);
    }
}
