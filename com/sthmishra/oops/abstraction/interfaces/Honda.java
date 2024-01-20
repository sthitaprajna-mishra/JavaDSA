package com.sthmishra.oops.abstraction.interfaces;

public class Honda implements Bike{

    @Override
    public void go() {
        System.out.println("Honda bike starts");
    }

    @Override
    public void stop() {
        System.out.println("Honda bike stops");
    }
}
