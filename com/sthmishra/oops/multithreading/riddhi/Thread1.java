package com.sthmishra.oops.multithreading.riddhi;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("inside run() of thread1...");
        for(int i = 0; i < 100; i++) {
            System.out.print(i + "\t");
        }
    }
}
