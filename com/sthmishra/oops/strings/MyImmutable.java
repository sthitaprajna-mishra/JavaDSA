package com.sthmishra.oops.strings;

public class MyImmutable {
    int x;
    MyImmutable(int x) {
        this.x = x;
        System.out.println("new obj created");
    }

    public MyImmutable change(int x) {
        if(this.x==x) return this;
        return new MyImmutable(x);
    }

    public static void main(String[] args) {
        MyImmutable m1 = new MyImmutable(20);
        MyImmutable m2 = m1.change(20);
        System.out.println("m1 " + m1);
        System.out.println("m2 " + m2);
        System.out.println("m1 == m2 " + (m1 == m2));
        MyImmutable m3 = m1.change(30);
        System.out.println("m1 " + m1);
        System.out.println("m3 " + m3);
        System.out.println("m1 == m3 " + (m1 == m3));
    }
}
