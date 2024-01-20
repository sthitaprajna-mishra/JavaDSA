package com.sthmishra.oops.abstraction.udemy;

public abstract class HPLaptop implements TouchScreenLaptop {
    @Override
    public void scroll() {
        System.out.println("common scroll functionality for HP laptops");
    }
}

