package com.sthmishra.oops.abstraction;

public abstract class BMW {

    void commonFunctionality() {
        System.out.println("Inside commonFunc method");
    }

    abstract void accelerate();

    public static void main(String[] args) {
        System.out.println("Inside main method of abstract class. This is also a partial class.");
    }

}
