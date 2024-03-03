package com.referencebook.generics;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    public double average() {
        double sum = 0.0;

        for(T el : nums) {
            sum += el.doubleValue();
        }

        return sum/nums.length;
    }

    public boolean sameAverage(Stats<?> obj) {
        return this.average() == obj.average();
    }

}
