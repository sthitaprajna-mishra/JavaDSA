package com.sthmishra.oops.abstraction.udemy;

public abstract class DellLaptop implements TouchScreenLaptop {
    @Override
    public void scroll() {
        System.out.println("common scroll functionality for Dell laptops");
    }
}