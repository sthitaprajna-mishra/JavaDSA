package com.sthmishra.java8.streams.engdigest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Optional<Integer> ans = sendRandomInt();
        if(ans.isPresent()) {
            System.out.println("not null returned! yay!");
        }

        ans.ifPresent(System.out::println);

        int result = ans.orElse(98);
        System.out.println(result);
    }

    public static Optional<Integer> sendRandomInt() {
        return Optional.ofNullable(null);
    }
}
