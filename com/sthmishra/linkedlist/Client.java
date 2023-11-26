package com.sthmishra.linkedlist;

public class Client {
    public static void main(String[] args) {
        // int linked list
        CustomLinkedList<Integer> ll1 = new CustomLinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);

        ll1.addFirst(0);
        ll1.addLast(4);

//        System.out.println("Total length of linked list ll1: " + ll1.size());

//        for(int el : ll1) {
//            System.out.println(el);
//        }

        // string linked list
        CustomLinkedList<String> ll2 = new CustomLinkedList<>();
        ll2.add("David");
        ll2.add("George");
        ll2.add("Natalie");

        for(String el : ll2) {
            System.out.println(el);
        }

        System.out.println("Total length of linked list ll2: " + ll2.size());

        ll2.addAt(2, "Mary");

        for(String el : ll2) {
            System.out.println(el);
        }

        System.out.println("Total length of linked list ll2: " + ll2.size());

        ll2.removeAt(2);

        ll2.add("Sheldon");
        ll2.add("Louis");

        Node<String> head = ll2.reverse();

        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
