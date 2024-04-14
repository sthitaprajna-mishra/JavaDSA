package com.sthmishra.practice.interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,6,7,8,4,3);

        for(int el : numbers) {
            System.out.println(el);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
