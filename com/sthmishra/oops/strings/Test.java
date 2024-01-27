package com.sthmishra.oops.strings;

public class Test {
    public static void main(String[] args) {
        Passenger p1 = new Passenger();
        p1.setId(123);
        p1.setFirstName("Bharath");
        p1.setLastName("Reddy");
        System.out.println(p1);
        System.out.println(p1.hashCode());
        Passenger p2 = new Passenger();
        p2.setId(123);
        p2.setFirstName("Bharath");
        p2.setLastName("Reddy");
        System.out.println(p2.hashCode());
        System.out.println(p2.equals(p1));
    }
}
