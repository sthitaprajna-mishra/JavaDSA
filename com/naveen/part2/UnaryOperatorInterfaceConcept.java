package com.naveen.part2;

import java.util.function.UnaryOperator;
import java.util.*;

public class UnaryOperatorInterfaceConcept {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = (i1)->i1*i1*i1;
        System.out.println(unary.apply(5));

        List<String> langList = new ArrayList<>();
        langList.add("C++");
        langList.add("Java");
        langList.add("Python");
        System.out.println(langList);

        langList.replaceAll(e->e.toUpperCase());
        System.out.println(langList);
    }
}
