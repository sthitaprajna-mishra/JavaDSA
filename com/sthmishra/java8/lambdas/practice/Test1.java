package com.sthmishra.java8.lambdas.practice;

public class Test1 {
    public static void main(String[] args) {
        int a = 100;
        IEmployee emp = () -> {
//            System.out.println("a: " + a);
          return 100.0;
        };
        a = 20;

        System.out.println(emp.getSalary());
    }
}
