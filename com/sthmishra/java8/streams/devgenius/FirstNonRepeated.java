package com.sthmishra.java8.streams.devgenius;

// Given a String, find the first non-repeated character in it using Stream functions?

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

       Character ans = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1).map(i->i.getKey()).findFirst().get();
        System.out.println(ans);

        String result = input.chars().filter(i->input.indexOf(i) == input.lastIndexOf(i)).mapToObj(c->Character.toString(c)).findFirst().get();
        System.out.println(result);
    }
}
