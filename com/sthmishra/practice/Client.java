package com.sthmishra.practice;

public class Client {
    public static void main(String[] args) {
        String name1 = "Anderson";
        System.out.println(name1);
        updateString(name1);
        System.out.println(name1);

    }

    public static void updateString(String nameParam) {
        nameParam = "Jim";
    }
}
