package com.referencebook.inheritance;

public abstract class Base {
    public static void show() {
        System.out.println("Base::show() called");
    }

    private void secretMethod() {
        System.out.println("Base::private()");
    }

}
