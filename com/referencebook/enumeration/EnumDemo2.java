package com.referencebook.enumeration;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple[] apValues = Apple.values();
        for(Apple el : apValues) {
            System.out.println(el);
        }

        Apple ap = Apple.valueOf("Winesap");
        System.out.println(ap);
    }
}
