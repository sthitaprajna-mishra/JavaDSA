package com.striver.linkedlist;

public class Service {
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

    public Node addTwoNumbersRough(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;
        int carry = 0;

        Node head3 = new Node(-1);
        Node tail = head3;

        while(temp1 != null && temp2 != null) {
            int num = temp1.data + temp2.data + carry;
            carry = num/10;
            num = num%10;

            tail.next = new Node(num);
            tail = tail.next;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if(temp1 != null) {
            while(temp1 != null) {
                int num = temp1.data + carry;
                carry = num/10;
                num = num%10;

                tail.next = new Node(num);
                tail = tail.next;

                temp1 = temp1.next;
            }
        }

        if(temp2 != null) {
            while(temp2 != null) {
                int num = temp2.data + carry;
                carry = num/10;
                num = num%10;

                tail.next = new Node(num);
                tail = tail.next;

                temp2 = temp2.next;
            }
        }

        if(carry != 0) {
            tail.next = new Node(carry);
        }

        return head3.next;
    }

    public void traverse(Node head) {
        Node temp = head;

        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
    }
}
