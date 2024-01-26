package com.sthmishra.oops.multithreading.riddhi;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private final Queue<Integer> queue;
    private int capacity;

    BlockingQueue(int capacity) {
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean add(int item) {
        synchronized (this) {
            while(queue.size() == capacity) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.add(item);
            this.notifyAll();
            return true;
        }
    }

    public int remove() {
        synchronized (this) {
            while(queue.size() == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.notifyAll();
            return queue.poll();
        }
    }
}
