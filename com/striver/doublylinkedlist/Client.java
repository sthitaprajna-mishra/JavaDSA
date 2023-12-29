package com.striver.doublylinkedlist;

public class Client {
    public static void main(String[] args) {
        Service s = new Service();

//        L3. Introduction to Doubly LinkedList | Insertions and Deletions
        int[] arr = new int[] { 1, 3, 2, 4};
        Node head = s.constructDLL(arr);
        s.traverse(head);
    }
}
