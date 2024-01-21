package com.sthmishra.oops.inheritance;

public class Client {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.userType);
        p1.describe();

        Child c1 = new Child();
        System.out.println(c1.userType);
        c1.describe();

        Parent p2 = new Child();
        System.out.println(p2.userType);
        p2.describe();
    }
}
