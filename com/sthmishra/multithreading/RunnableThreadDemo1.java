package com.sthmishra.multithreading;

public class RunnableThreadDemo1 {
    public static void main(String[] args) {
        Runnable runner = () -> {
            try {
                for(int i = 5; i > 0; i--) {
                    System.out.println("Child thread: " + i);
                    Thread.sleep(1000);
                }
            } catch(InterruptedException ex) {
                System.out.println(ex);
            }
        };

        Thread t = new Thread(runner, "custom-child-thread");
        t.start();
    }
}
