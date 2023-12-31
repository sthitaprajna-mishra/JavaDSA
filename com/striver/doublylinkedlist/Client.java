package com.striver.doublylinkedlist;

public class Client {
    public static void main(String[] args) {
        Service s = new Service();

//        L3. Introduction to Doubly LinkedList | Insertions and Deletions
//        int[] arr = new int[] { 1, 3, 2, 4};
//        Node head = s.constructDLL(arr);
//        s.traverse(head);

//        L18. Delete all occurrences of a Key in DLL
//        Node head = new Node(8);
//        Node secondNode = new Node(2, null, head);
//        Node thirdNode = new Node(3, null, secondNode);
//        Node fourthNode = new Node(8, null, thirdNode);
//        Node fifthNode = new Node(15, null, fourthNode);
//        Node sixthNode = new Node(9, null, fifthNode);
//        Node seventhNode = new Node(8, null, sixthNode);
//
//        head.next = secondNode;
//        secondNode.next = thirdNode;
//        thirdNode.next = fourthNode;
//        fourthNode.next = fifthNode;
//        fifthNode.next = sixthNode;
//        sixthNode.next = seventhNode;
//
//
//        s.traverse(s.deleteAllKNodes(head, 8));

//        L19. Find all Pairs with given Sum in DLL
        Node head = new Node(1);
        Node secondNode = new Node(2, null, head);
        Node thirdNode = new Node(3, null, secondNode);
        Node fourthNode = new Node(4, null, thirdNode);
        Node fifthNode = new Node(5, null, fourthNode);
        Node sixthNode = new Node(7, null, fifthNode);
        Node seventhNode = new Node(8, null, sixthNode);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = seventhNode;


        s.findPairSum(head, 5);
    }
}
