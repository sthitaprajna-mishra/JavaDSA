package com.sthmishra.linkedlist;

import java.util.Iterator;

public class CustomLinkedList<T extends Comparable<T>> implements Iterable<T> {
    Node<T> head;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if(head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void addLast(T data) {
        add(data);
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node<T> temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAt(int K, T data) {
        Node<T> temp = head;
        Node<T> newNode = new Node<>(data);
        if(temp == null) {
            head = newNode;
        }
        else {
            if(K <= 0) addFirst(data);
            else if(K >= this.size()) addLast(data);
            else {
                int i = 0;
                while(temp != null && i < K-1) {
                    temp = temp.next;
                    i++;
                }
                if(temp != null) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
            }
        }
    }

    public void removeFirst() {
        if(head == null) return;
        head = head.next;
    }

    public void removeLast() {
        Node<T> temp = head;
        if(temp == null) return;
        if(temp.next == null) {
            head = null;
            return;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void removeAt(int K) {
        Node<T> temp = head;
        if(temp == null) return;

        if(K <= 0) removeFirst();
        else if(K >= this.size()) removeLast();
        else {
            int i = 0;
            while(temp != null && i < K-1) {
                temp = temp.next;
                i++;
            }
            if(temp != null) {
                temp.next = temp.next.next;
            }
        }

    }

    public Node<T> reverse() {
        Node<T> temp;
        Node<T> prev = null;
        Node<T> curr = head;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }

    public int size() {
        Node<T> temp = head;
        int totalSize = 0;
        while(temp != null) {
            temp = temp.next;
            totalSize++;
        }
        return totalSize;
    }

    public Node<T> middle() {
        Node<T> slow = head;
        Node<T> fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node<T> middle(Node<T> paramHead) {
        Node<T> slow = paramHead;
        Node<T> fast = paramHead;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void sort() {
        head = mergeSort(head);
    }

    public Node<T> mergeSort(Node<T> head) {
        if (head == null || head.next == null) return head;

        Node<T> mid = middle(head);
        Node<T> head2 = mid.next;
        mid.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);

        return merge(head, head2);
    }

    public Node<T> merge(Node<T> head, Node<T> head2) {
        Node<T> h3 = new Node<>(null);
        Node<T> tail = h3;

        while (head != null && head2 != null) {
            if (head.data.compareTo(head2.data) <= 0) {
                tail.next = head;
                head = head.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head != null) tail.next = head;
        if (head2 != null) tail.next = head2;

        return h3.next;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomLLIterator(this);
    }

    private class CustomLLIterator implements Iterator<T> {
        private final Node<T> head;
        private final int size;
        private int index = 0;

        public CustomLLIterator(CustomLinkedList<T> linkedList) {
            this.head = linkedList.head;
            this.size = linkedList.size();
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            int currIndex = 0;
            Node<T> temp = this.head;
            while(currIndex < index) {
                temp = temp.next;
                currIndex++;
            }
            index++;
            return temp.data;
        }
    }
}
