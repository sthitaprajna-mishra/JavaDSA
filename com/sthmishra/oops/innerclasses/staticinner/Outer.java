package com.sthmishra.oops.innerclasses.staticinner;

public class Outer {
    static void f1() {
        System.out.println("static void f1() - outer static method");
    }

    static class Inner {
        static void f2() {
            System.out.println("static void f2() - inner static method");
        }
        void f3() {
            System.out.println("void f3() - inner non-static method");
        }
    }

    public static void main(String[] args) {
        Outer.f1();
        Outer.Inner.f2();

        Outer.Inner obj = new Outer.Inner();
        obj.f3();

    }
}
