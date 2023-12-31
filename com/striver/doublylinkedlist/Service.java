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

    //    L18. Delete all occurrences of a Key in DLL
    public Node deleteAllKNodes(Node head, int K) {
        if(head == null) return null;

        Node temp = head;
        while(temp != null) {
            if(temp.data == K) {
                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if(temp == head) {
                    head = nextNode;
                }

                if(prevNode != null) prevNode.next = nextNode;
                if(nextNode != null) nextNode.prev = prevNode;
            }
            temp = temp.next;
        }

        return head;
    }

//    L19. Find all Pairs with given Sum in DLL
    // this approach will work only if the DLL is sorted
    public void findPairSum(Node head, int K) {
        Node temp1 = head, temp2 = head;
        while(temp2.next != null) {
            temp2 = temp2.next;
        }
        while(temp1.data < temp2.data) {
            int sum = temp1.data + temp2.data;
            if(sum == K) {
                System.out.println(temp1.data  + ", " + temp2.data);
                temp1 = temp1.next;
                temp2 = temp2.prev;
            }
            else if(sum < K) {
                temp1 = temp1.next;
            }
            else {
                temp2 = temp2.prev;
            }
        }
    }
}
