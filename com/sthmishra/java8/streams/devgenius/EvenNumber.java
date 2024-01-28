package com.sthmishra.java8.streams.devgenius;

// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        // store it in a list
        List<Integer> result = list.stream().filter(i->i%2==0).collect(Collectors.toList());

        // print output
        list.stream().filter(i->i%2==0).forEach(i->System.out.print(i+"\t"));
        System.out.println();
        list.stream().filter(i->i%2==0).forEach(System.out::println);

    }
}
