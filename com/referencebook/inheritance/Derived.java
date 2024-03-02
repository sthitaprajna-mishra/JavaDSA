package com.referencebook.inheritance;

public class Derived extends Base {
    public static void show() {
        System.out.println("Base::show() called");
    }

    protected void secretMethod() {
        System.out.println("Derived::private()");
    }
}
