package com.sthmishra.oops.strings;

public class StringMethods {
    public static void main(String[] args) {
        String sample = "Hello world!";

        System.out.println(sample);
        System.out.println(sample.length());
        System.out.println(sample.indexOf('o'));
        System.out.println(sample.charAt(3));
        System.out.println(sample.substring(2));
        System.out.println(sample.substring(2,4));

        String[] result = sample.split(" ");
        for(String el : result) {
            System.out.print(el + ", ");
        }
        System.out.println();
        System.out.println(sample.replace('l', 'x'));
        System.out.println(sample.toLowerCase());
        System.out.println(sample.toUpperCase());
    }
}
