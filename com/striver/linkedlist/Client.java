package com.striver.linkedlist;

public class Client {
    public static void main(String[] args) {
        Node head1 = new Node(3);
        head1.next = new Node(5);

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(9);
        head2.next.next.next = new Node(9);

//        7 -> 0 -> 0 -> 0 -> 1

//        Node head1 = new Node(3);
//        head1.next = new Node(8);
//        head1.next.next = new Node(7);
//
//
//        Node head2 = new Node(5);
//        head2.next = new Node(2);
//        head2.next.next = new Node(4);
//        head2.next.next.next = new Node(1);

//        8 -> 0 -> 2 -> 2

        Service s = new Service();
        Node result = s.addTwoNumbers(head1, head2);

        s.traverse(result);

    }
}
