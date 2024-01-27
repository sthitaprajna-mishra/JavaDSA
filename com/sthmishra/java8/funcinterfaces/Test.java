package com.sthmishra.java8.funcinterfaces;

public class Test {
    public static void main(String[] args) {
//        SampleFInterface obj = new C();
//        obj.myMethod();

        SampleFInterface obj = () -> System.out.println("inside lambda exp");
        obj.myMethod();
    }
}
