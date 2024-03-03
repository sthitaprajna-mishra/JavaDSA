package com.referencebook.generics;

public class GenericsDemo1 {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        System.out.println(iob.average());

        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<>(dnums);
        System.out.println(dob.average());

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        System.out.println(fob.average());

        if(iob.sameAverage(dob)) System.out.println("iob average = dob average");
        if(iob.sameAverage(fob)) System.out.println("iob average = fob average");
    }
}
