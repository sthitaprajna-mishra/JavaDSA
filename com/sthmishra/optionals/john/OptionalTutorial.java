package com.sthmishra.optionals.john;

import com.sthmishra.reflection.john.Cat;

import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {
        Cat cat1 = findCatByName("Alfred");
        if(cat1 != null) {
            System.out.println(cat1.getAge());
        } else {
            System.out.println(0);
        }

        Optional<Cat> cat2 = findOptionalCatByName("Jonas");
        System.out.println(cat2.isPresent());
        System.out.println(cat2.isEmpty());
        System.out.println(cat2.orElse(new Cat("Jon", 2)));
        System.out.println(cat2.orElseGet(()-> new Cat("Heather", 3)));

        int age = cat2.map(Cat::getAge)
                    .orElse(0);
        System.out.println(age);
    }

    private static Cat findCatByName(String name) {
//        return new Cat(name, 3);
        return null;
    }

    private static Optional<Cat> findOptionalCatByName(String name) {
        return Optional.of(new Cat(name, 3));
    }
}
