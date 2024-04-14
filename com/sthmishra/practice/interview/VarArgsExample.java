package com.sthmishra.practice.interview;

public class VarArgsExample {
    public static void main(String[] args) {
        VarArgsExample obj = new VarArgsExample();
        obj.sampleMethod1("Toby", "Madison", "Kevin", "Charles");
        obj.sampleMethod2(28,"Toby", "Madison", "Kevin", "Charles");
    }

    public void sampleMethod2(int score, String...names) {
        System.out.println("Score: " + score);
        for(String name : names) {
            System.out.println(name);
        }
    }


    public void sampleMethod1(String... args) {
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
