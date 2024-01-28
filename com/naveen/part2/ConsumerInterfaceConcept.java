package com.naveen.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {
    public static void main(String[] args) {
        Consumer<String> func = x -> System.out.println(x);
        func.accept("This is Naveen here");

        List<String> list = Arrays.asList("Yamaha", "Royal Enfield", "Kawasaki");
        list.forEach(i -> func.accept(i));

    }
}
