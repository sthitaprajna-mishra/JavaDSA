package com.sthmishra.linkedlist;

public class ClientLoop {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> temp = head;
        Node<Integer> loopStart = null;
        for(int i = 2; i <= 18; i++) {
            if(i == 9) {
                loopStart = new Node<>(i);
                temp.next = loopStart;
            } else {
                temp.next = new Node<>(i);
            }
            temp = temp.next;
        }
        Node<Integer> t = head;
        while(t.next != null) {
//            System.out.println(t.data);
            t = t.next;
        }
        t.next = loopStart; // this will start loop
//        t = head;
//        while(t.next != null) {
//            System.out.println(t.data);
//            t = t.next;
//        }

        System.out.println("Loop exists: " + checkIfLoopExists(head));
        System.out.println("Loop starts at node with data: " + findLoopStartNode(head).data);
        System.out.println("Remove loop");
        removeLoop(head);
        System.out.println("Loop exists: " + checkIfLoopExists(head));
    }

    public static <T> boolean checkIfLoopExists(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }

        return false;
    }

    public static <T> Node<T> findLoopStartNode(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static <T> void removeLoop(Node<T> head) {
        Node<T> slow = head;
        Node<T> fast = head;
        Node<T> prev = null;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;
    }
}
