package com.naveen.part2;

import java.util.function.Predicate;
import java.util.*;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {
    public static void main(String[] args) {
        Predicate<Integer> checkEven = (i)->i%2==0;
        List<Integer> list = Arrays.asList(1, 7, 8, 4, 5, 6, 3);

        List<Integer> ans = list.stream().filter(checkEven).collect(Collectors.toList());
        System.out.println(ans);
    }
}
