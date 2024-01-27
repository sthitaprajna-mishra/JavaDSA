package com.sthmishra.oops.innerclasses.nonstaticinner;

public class Outer {
    private static int x = 50;
    private int y;

    Outer(int y) {
        this.y = y;
    }

    void f1() {
        System.out.println("Outer Class Non Static Method f2()");
    }
    class Inner {
        private int y;

        Inner(int y) {
            this.y = y;
        }

        private void f2() {
            System.out.println("Inner Class Non Static Method f2()");
            System.out.println(Outer.x);
            System.out.println(Outer.this.y);
        }
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer(80);
        Inner innerObj = outerObj.new Inner(30);
        innerObj.f2();
        System.out.println("inner y: " + innerObj.y);
    }
}
