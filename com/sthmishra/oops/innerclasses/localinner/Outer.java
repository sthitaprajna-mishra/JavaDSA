package com.sthmishra.oops.innerclasses.localinner;

public class Outer {

    void f1() {
        System.out.println("Inside outer f1()");
        class LocalInner {
            void f2() {
                System.out.println("inside local inner f2()");
            }
        }
        LocalInner inner = new LocalInner();
        inner.f2();
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.f1();
    }
}
