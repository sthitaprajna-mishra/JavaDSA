package com.sthmishra.java8.streams.devgenius;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 9, 4, 5, 6, 3, 2, 7, 8, 60};
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        List<Integer> duplicates = numList.stream().filter(i->Collections.frequency(numList, i) > 1).collect(Collectors.toList());
        System.out.println(duplicates.size() != 0);
    }
}
