package com.sthmishra.oops.multithreading.riddhi;

public class SyncTester {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        new Thread(() -> {
            int counter = 0;
            while(counter < 10) {
                System.out.println("Pushed: " + stack.push(100));
                counter++;
            }
        }, "Pusher").start();

        new Thread(() -> {
            int counter = 0;
            while(counter < 10) {
                System.out.println("Popped: " + stack.pop());
                counter++;
            }
        }, "Popper").start();

        System.out.println("main is exiting");
    }
}
