package com.referencebook.exceptionhandling;

public class StaticBlockExample {
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }

    static {
        System.out.println("Static block executed");
        try {
            System.out.println("Inside try block");
            throw new Exception("custom exception from static block");
        } catch (Exception e) {
            System.out.println("exception caught");
            System.out.println(e.getMessage());
        }
    }
}
