package com.sthmishra.oops.multithreading;

public class MultiThreaded extends Thread{
    public static void main(String[] args) {
        MultiThreaded mt = new MultiThreaded();
        mt.start();

        for(int j = 1; j <= 200; j++) {
            System.out.print("j: " + j + "\t");
        }
    }

    @Override
    public void run(){
        printNumbers();
    }

    public void printNumbers() {
        for(int i = 1; i <= 200; i++) {
            System.out.print("i: " + i + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
