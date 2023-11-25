package com.sthmishra.linkedlist;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {
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

    public int size() {
        Node<T> temp = head;
        int totalSize = 0;
        while(temp != null) {
            temp = temp.next;
            totalSize++;
        }
        return totalSize;
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
