package com.sthmishra.linkedlist;

public class MyHashSet {
    Node head;

    public MyHashSet() {
        this.head = null;
    }

    public void add(int key) {
        if(this.head == null) {
            this.head = new Node(key);
            return;
        }
        if(contains(key)) return;

        Node temp = this.head;
        while(temp.next != null) temp = temp.next;
        temp.next = new Node(key);
    }

    public void remove(int key) {
        if(this.head == null) return;

        Node temp = this.head;
        Node prev = null;

        // delete head
        if(temp.data == key) {
            this.head = this.head.next;
            return;
        }

        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) return;

        prev.next = temp.next;
    }

    public boolean contains(int key) {
        if(this.head == null) return false;
        Node temp = this.head;
        while(temp != null) {
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
