package com.naveen.part3;

import java.util.*;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<String> tvSeries = Arrays.asList("Game of Thrones", "Breaking Bad", "The Big Bang Theory", "The Walking Dead", "Prison Break");

        // 1. using java 8 foreach loop and lambda expression
        System.out.println("\n--------------------1. using java 8 foreach loop and lambda expression--------------------");
        tvSeries.forEach((show)-> System.out.print(show+" "));
        // 2. using java 8 foreach loop and method reference
        System.out.println("\n--------------------2. using java 8 foreach loop and method reference--------------------");
        tvSeries.forEach(System.out::println);
        // 3. using Iterator
        System.out.println("\n--------------------3. using Iterator--------------------");
        Iterator<String> iterator = tvSeries.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 4. using Iterator and java 8 forEachRemaining method
        System.out.println("\n--------------------4. using Iterator and java 8 forEachRemaining method--------------------");
        iterator = tvSeries.iterator();
        iterator.forEachRemaining(show -> {
            System.out.println(show);
        });
        // 5. using foreach loop
        System.out.println("\n--------------------5. using foreach loop--------------------");
        for(String show : tvSeries) System.out.println(show);
        // 6. using for loop
        System.out.println("\n--------------------6. using for loop--------------------");
        for(int i = 0; i < tvSeries.size(); i++) System.out.println(tvSeries.get(i));
        // 7. using list iterator to traverse in both directions
        System.out.println("\n--------------------7. using list iterator to traverse in both directions--------------------");
        ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
        while(tvSeriesListIterator.hasPrevious()) System.out.println(tvSeriesListIterator.previous());
    }
}
