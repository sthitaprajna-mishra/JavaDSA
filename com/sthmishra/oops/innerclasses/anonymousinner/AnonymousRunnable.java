package com.sthmishra.oops.innerclasses.anonymousinner;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
          @Override
          public void run() {
              System.out.println("Runnable implementation using anonymous classes");
          }
        };

        Thread t1 = new Thread(runner);
        t1.start();
    }
}
