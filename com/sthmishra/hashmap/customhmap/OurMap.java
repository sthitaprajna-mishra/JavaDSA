package com.sthmishra.hashmap.customhmap;

import java.util.ArrayList;
import java.util.List;

public class OurMap<K, V> {
    private List<MapNode<K, V>> bucket;
    private int capacity;
    private int size;
    private final int INITIAL_CAPACITY = 5;

    public OurMap() {
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for(int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);

        MapNode<K, V> headNode = bucket.get(bucketIndex);
        while(headNode != null) {
            if(headNode.key.equals(key)) {
                return headNode.value;
            }
            headNode = headNode.next;
        }
        return null;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode%capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> headNode = bucket.get(bucketIndex);
        while(headNode != null) {
            if(headNode.key.equals(key)) {
                headNode.value = value;
                return;
            }
            headNode = headNode.next;
        }


        size++;
    }

    public void remove(K key) {

    }

    private class MapNode<K, V> {
        K key;
        V value;
        MapNode<K, V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
