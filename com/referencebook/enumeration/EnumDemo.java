package com.referencebook.enumeration;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        System.out.println(ap);

        ap = Apple.GoldenDel;

        if(ap == Apple.GoldenDel) {
            System.out.println("ap is Apple.GoldenDel");
        }

        switch (ap) {
            case Jonathan -> System.out.println("ap is Apple.Jonathan");
            case GoldenDel -> System.out.println("ap is Apple.GoldenDel");
            default -> System.out.println("ap is something else");
        }


    }
}
