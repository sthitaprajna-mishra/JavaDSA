package com.referencebook.enumeration;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap = Apple.Winesap;
        System.out.println("Price of " + ap + " apple is: " + ap.getPrice());

        for(Apple apple : Apple.values()) {
            System.out.println("Price of " + apple + " apple is: " + apple.getPrice());
        }
    }
}
