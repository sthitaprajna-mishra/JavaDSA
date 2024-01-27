package com.sthmishra.java8.optional;

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println("isPresent() " + empty.isPresent());
        Optional<String> data = Optional.of("Optional but very useful");
        System.out.println("isPresent() " + data.isPresent());
        System.out.println("Value: " + data.get());
        if(empty.isPresent()) {
            System.out.println(empty.get());
        }
        System.out.println(data.filter(s->s.equals("Optional but very useful")));
        System.out.println(data.filter(s->s.equals("... but very useful")));

        System.out.println(data.orElse("Default value"));
        System.out.println(empty.orElse("Default value"));

        data.ifPresent(System.out::println);
        empty.ifPresent(System.out::println);

    }
}
