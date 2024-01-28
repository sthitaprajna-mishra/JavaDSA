package com.naveen.part1;

public class LambdaDeclaration {
    public static void main(String[] args) {
        WebPage w1 = new WebPage() {
            @Override
            public void header(String value) {
                System.out.println("Anonymous class " + value);
            }
        };
        w1.header("Google");

        WebPage w2 = (name)->{
            System.out.println("Lambda exp " + name);
        };
        w2.header("Facebook");

        WebPage w3 = (name)-> System.out.println("one liner " + name);
        w2.header("final");
    }
}
