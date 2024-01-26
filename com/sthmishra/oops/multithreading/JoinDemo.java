package com.sthmishra.oops.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
    public static int N = 0, SUM = 0;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println("Sum of first n numbers");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        JoinDemo.N = sc.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        try {
            jd.join();
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Sum of first " + JoinDemo.N + " numbers is " + JoinDemo.SUM);

        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end-start)/1000 + " seconds");
    }

    public void run() {
        for(int i = 1; i <= JoinDemo.N; i++) {
            JoinDemo.SUM += i;
            try {
                Thread.sleep(100);
            } catch(InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
