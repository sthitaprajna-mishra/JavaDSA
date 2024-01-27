package com.sthmishra.java8.methodref.constructors;

public class MyClass {
    private String s;

    MyClass(String s) {
        this.s = s;
        System.out.println("Inside constructor: " + s);
    }

}
