package com.sthmishra.oops.multithreading.riddhi;

public class Stack {
    private final int[] array;
    private int stackTop;
    final Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length-1;
    }

    public synchronized boolean push(int element) {
            if(!isFull()) {
                stackTop++;
                try {
                    Thread.sleep(1000);
                } catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
                array[stackTop] = element;
                return true;
            }
            return false;
    }

    public synchronized int pop() {
            if(isEmpty()) return Integer.MIN_VALUE;

            int value = array[stackTop];
            try {
                Thread.sleep(1000);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
            stackTop--;
            return value;
    }
}
