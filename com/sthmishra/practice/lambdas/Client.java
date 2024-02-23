package com.sthmishra.practice.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Country> countries = List.of(
                new Country("China", "Asia", 25L),
                new Country("India", "Asia", 26L),
                new Country("Italy", "Europe", 8L),
                new Country("Germany", "Europe", 5L),
                new Country("France", "Europe", 9L),
                new Country("Brazil", "South America", 15L),
                new Country("US", "North America", 12L),
                new Country("Canada", "North America", 10L)
                );

        long answer = findContinentPopulation(countries, "North America");

        System.out.println(answer);
    }

    public static long findContinentPopulation(List<Country> countries, String continent) {
        return countries.stream()
                .filter(e -> e.getContinent().equals(continent))
                .mapToLong(Country::getPopulation)
                .sum();
    }
}
