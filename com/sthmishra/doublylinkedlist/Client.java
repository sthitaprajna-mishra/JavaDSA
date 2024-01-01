package com.sthmishra.doublylinkedlist;

public class Client {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2, head, null);
        head.next.next = new Node(3, head.next, null);
        head.next.next.next = new Node(4, head.next.next, null);

        System.out.println(head);
    }

    Node reverseDLL(Node head) {
        if(head == null) return head;

        Node prev = null;
        Node curr = head;
        Node temp = null;

        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            curr.prev = temp;

            prev = curr;
            curr = temp;
        }

        return head;
    }
}
