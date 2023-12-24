package com.striver.linkedlist;

import java.util.*;

public class Service {

    public void traverse(Node head) {
        Node temp = head;

        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
    }

//    ********** L5. Add 2 numbers in LinkedList | Dummy Node Approach **********
    public Node addTwoNumbers(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;
        int carry = 0;

        Node head3 = new Node(-1);
        Node tail = head3;

        while(temp1 != null || temp2 != null) {
            int num = carry;

            if(temp1 != null) num += temp1.data;
            if(temp2 != null) num += temp2.data;

            carry = num/10;
            num = num%10;

            tail.next = new Node(num);
            tail = tail.next;

            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }

        if(carry != 0) {
            tail.next = new Node(carry);
        }

        return head3.next;
    }

//    ********** L6. Odd Even Linked List | Multiple Approaches **********
    public Node oddEven(Node head) {
        if(head == null || head.next == null) return head;

        Node odd = head, even = head.next, evenHead = head.next;

        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
    public Node oddEvenBruteForce(Node head) {
        if(head == null || head.next == null) return head;

        Node odd = head, even = head.next;
        List<Integer> result = new LinkedList<>();

        while(odd != null && odd.next != null) {
            result.add(odd.data);
            odd = odd.next.next;
        }
        if(odd != null) {
            result.add(odd.data);
        }

        while(even != null && even.next != null) {
            result.add(even.data);
            even = even.next.next;
        }
        if(even != null) {
            result.add(even.data);
        }

        Node temp = head;
        int index = 0;

        while(temp != null) {
            temp.data = result.get(index);
            temp = temp.next;
            index++;
        }

        return head;
    }
}
