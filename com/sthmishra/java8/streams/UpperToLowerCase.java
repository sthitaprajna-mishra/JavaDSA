package com.sthmishra.java8.streams;

import java.util.*;

public class UpperToLowerCase {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("JOHN");
        l1.add("JESSICA");
        l1.add("DAVID");
        System.out.println(l1);

        List<String> l2 = l1.stream().map(String::toLowerCase).toList();
        System.out.println(l2);
    }
}
