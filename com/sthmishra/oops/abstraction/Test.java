package com.sthmishra.oops.abstraction;

public class Test {
    public static void main(String[] args) {
        ThreeSeries three = new ThreeSeries();
        three.commonFunctionality();;
        three.accelerate();

        FiveSeries five = new FiveSeries();
        five.commonFunctionality();
        five.accelerate();
    }
}
