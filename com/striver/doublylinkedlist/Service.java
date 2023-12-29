package com.striver.doublylinkedlist;

public class Service {

    public void traverse(Node head) {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " ~ ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

//    L3. Introduction to Doubly LinkedList | Insertions and Deletions
    public Node constructDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    public Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        Node prev = temp.prev;
        prev.next = null;
        temp.prev = null;

        return head;
    }

    public Node deleteKthElement(Node head, int K) {
        if(head == null) return null;

        Node temp = head;
        int i = 0;
        while(temp != null && i < K) {
            temp = temp.next;
            i++;
        }

        Node prevNode = temp.prev;
        Node nextNode = temp.next;

        if(prevNode == null && nextNode == null) {
            return null;
        }
        else if(prevNode == null) {
            return deleteHead(head);
        }
        else if(nextNode == null) {
            return deleteTail(head);
        }
        else {
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
        return head;
    }

    public void deleteNode(Node temp) {
        Node prevNode = temp.prev;
        Node nextNode = temp.next;

        if(nextNode == null) {
            prevNode.next = null;
            temp.prev = null;
            return;
        }

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public Node insertBeforeHead(int data, Node head) {
        Node newNode = new Node(data, head, null);
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public Node insertBeforeTail(int data, Node head) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.prev;
        Node newNode = new Node(data, temp, prev);
        prev.next = newNode;
        temp.prev = newNode;
        return head;
    }
}
