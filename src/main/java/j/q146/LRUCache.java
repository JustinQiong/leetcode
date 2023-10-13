package j.q146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class DLinkedNode {
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;

        DLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

        DLinkedNode() {

        }
    }

    int size;
    int capacity;

    Map<Integer, DLinkedNode> cache = new HashMap<>();
    DLinkedNode head;
    DLinkedNode tail;

    LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        } else {
            moveToHead(node);
            return node.val;
        }
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            node = new DLinkedNode(key, value);
            addToHead(node);
            cache.put(key, node);
            size++;

            if (size > capacity) {
                DLinkedNode tailNode = removeTail();
                cache.remove(tailNode.key);
                size--;
            }
        } else {
            node.val = value;
            moveToHead(node);
        }
    }

    void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void addToHead(DLinkedNode node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    DLinkedNode removeTail() {
        DLinkedNode res = tail.prev;
        removeNode(tail.prev);
        return res;
    }

}
