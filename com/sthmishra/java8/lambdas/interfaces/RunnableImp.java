package com.sthmishra.java8.lambdas.interfaces;

public class RunnableImp implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }
}
