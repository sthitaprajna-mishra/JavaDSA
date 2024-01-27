package com.sthmishra.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i <= 10; i++) l1.add(i);

        System.out.println(l1);
        List<Integer> l2 = new ArrayList<>();

        for(Integer i : l1) {
            if(i%2 == 0) l2.add(i);
        }
        System.out.println(l2);

//        List<Integer> l3 = l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        List<Integer> l3 = l1.stream().filter(i -> i%2 == 0).toList();

        System.out.println(l3);

        long count = l1.stream().filter(i->i%2==0).count();
        System.out.println((int)count);

        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(9);
        unsortedList.add(2);
        unsortedList.add(5);
        unsortedList.add(24);
        System.out.println(unsortedList);

        Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);

        List<Integer> l4 = unsortedList.stream().sorted(comp).toList();
        System.out.println(l4);

        Integer max = l1.stream().max(comp).get();
        System.out.println(max);

        Integer min = l1.stream().min(comp).get();
        System.out.println(min);

        l1.stream().forEach(System.out::print);
    }
}
