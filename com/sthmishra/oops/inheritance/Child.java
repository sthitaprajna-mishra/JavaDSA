package com.sthmishra.oops.inheritance;

public class Child extends Parent{
    String userType = "child";

    @Override
    public void describe() {
        System.out.println("Inside child class");
    }
}
