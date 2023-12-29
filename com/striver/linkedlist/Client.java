package com.striver.linkedlist;

public class Client {
    public static void main(String[] args) {
        Service s = new Service();

//        ********** L5. Add 2 numbers in LinkedList | Dummy Node Approach **********

//        Node head1 = new Node(3);
//        head1.next = new Node(5);
//
//        Node head2 = new Node(4);
//        head2.next = new Node(5);
//        head2.next.next = new Node(9);
//        head2.next.next.next = new Node(9);

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

//        Node result = s.addTwoNumbers(head1, head2);
//
//        s.traverse(result);

//        ********** L6. Odd Even Linked List | Multiple Approaches **********

//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);

//        1 -> 3 -> 5 -> 2 -> 4

//        Node result = s.oddEven(head);

//        s.traverse(result);

//    ********** L7. Sort a LinkedList of 0's, 1's and 2's | Multiple Approaches **********

//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(0);
//        head.next.next.next = new Node(0);
//        head.next.next.next.next = new Node(2);
//        head.next.next.next.next.next = new Node(1);
//        head.next.next.next.next.next.next = new Node(2);
//        head.next.next.next.next.next.next.next = new Node(0);

//        0 -> 0 -> 0 -> 1 -> 1 -> 2 -> 2 -> 2

//        Node result = s.sortSpecial(head);
//
//        s.traverse(result);

//        Node head = new Node(6);
//        head.next = new Node(8);
//        head.next.next = new Node(2);
//        head.next.next.next = new Node(5);
//        head.next.next.next.next = new Node(3);
//        head.next.next.next.next.next = new Node(4);
//        head.next.next.next.next.next.next = new Node(1);

//        6 -> 8 -> 2 -> 5 -> 3 -> 1

//        Node result = s.removeFromEnd(head, 2);

//        s.traverse(result);

//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(3);
//        head.next.next.next.next = new Node(2);
//        head.next.next.next.next.next = new Node(1);

//        System.out.println(s.checkPalindrome(head));

        int[] arr = new int[] {12, 5, 6, 8};
        Node result = s.convertArrToLL(arr);
        s.traverse(result);
    }
}
