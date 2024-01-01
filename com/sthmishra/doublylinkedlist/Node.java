package com.sthmishra.doublylinkedlist;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node prev, Node next)
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
}
