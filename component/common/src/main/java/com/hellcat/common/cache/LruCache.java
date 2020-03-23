package com.hellcat.common.cache;

import java.util.HashMap;


/**
 * @author StandCN
 * 2018/12/21 21:50
 * <p>
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LruCache<K, V> {


    private Node head;
    private Node tail;
    private int size;
    private HashMap<K, Node> hashMap;

    public LruCache(int size) {
        this.size = size;
        hashMap = new HashMap<>(size);
    }

    public void put(K k, V v) {
        if (size < 1) {
            return;
        }
        Node node = hashMap.get(k);
        if (null == node) {
            node = newNode(k, v);
            hashMap.put(k, node);
            if (hashMap.size() == 1) {
                head = (tail = node);
                return;
            }
        }
        node.v = v;
        pushToHead(node);
        removeTail();
    }

    public V get(K k) {
        if (size < 1) {
            return null;
        }
        Node node = hashMap.get(k);
        if (null == node) {
            return null;
        }
        pushToHead(node);
        return node.v;
    }

    private Node newNode(K k, V v) {
        Node node = new Node();
        node.k = k;
        node.v = v;
        return node;
    }

    private void pushToHead(Node node) {
        if (node == head) {
            return;
        }
        if (node.pre != null) {
            node.pre.next = node.next;
        }
        if (node.next != null) {
            node.next.pre = node.pre;
        }
        if (tail == node) {
            tail = node.pre;
            if (tail != null) {
                tail.next = null;
            }
        }
        node.pre = null;
        node.next = head;
        if (null != head) {
            head.pre = node;
        }
        head = node;
    }

    private void removeTail() {
        if (hashMap.size() > size) {
            Node currentTail = tail;
            hashMap.remove(currentTail.k);
            tail = currentTail.pre;
            if (tail != null) {
                tail.next = null;
            }
        }
    }

    private class Node {
        K k;
        V v;

        Node next;
        Node pre;

    }
}




