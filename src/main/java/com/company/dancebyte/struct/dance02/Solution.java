package com.company.dancebyte.struct.dance02;

import java.util.HashMap;
import java.util.Map;


/**
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果关键字 (key) 存在于缓存中，则获取关键字的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果关键字已经存在，则变更其数据值；如果关键字不存在，
 * 则插入该组「关键字/值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 *
 *
 *
 * 进阶:
 *
 * 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 */
public class Solution {

    class LRUCache {

        class Node {
            Node pre;
            Node next;
            int value;
            int key;

            public Node(int key, int value) {
                this(key, value, null, null);
            }

            public Node(int key, int value, Node pre, Node next) {
                this.key = key;
                this.value = value;
                this.pre = pre;
                this.next = next;
            }
        }

        Node head;
        Node tail;
        int capacity = 0;
        Map<Integer, Node> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            head = new Node(-1, -1);
            tail = new Node(-2, -2);
            head.next = tail;
            tail.pre = head;
            head.pre = null;
            tail.next = null;
        }

        public int get(int key) {
            Node tmp = map.get(key);
            if (tmp == null) {
                //throw new RuntimeException("不存在");
                return -1;
            }
            removeNode(tmp);
            insertFront(tmp);
            return tmp.value;
        }

        public void insertFront(Node tmp) {
            tmp.next = head.next;
            tmp.next.pre = tmp;
            tmp.pre = head;
            head.next=tmp;
        }

        private void removeNode(Node tmp) {
            tmp.pre.next = tmp.next;
            tmp.next.pre = tmp.pre;
            tmp.next = null;
            tmp.pre = null;
        }

        public void put(int key, int value) {
            Node tmp = map.get(key);
            if (tmp == null) {
                tmp = new Node(key,value);
                insertFront(tmp);
                map.put(key, tmp);
            } else {
                tmp.value = value;
                removeNode(tmp);
                insertFront(tmp);
                map.put(key, tmp);
            }
            if (map.size() > capacity) {
                removeTail();
            }

        }

        private void removeTail() {
            Node remove = tail.pre;
            tail.pre = remove.pre;
            remove.pre.next = tail;
            remove.next = null;
            remove.pre = null;
            map.remove(remove.key);
        }
    }

    public static void main(String[] args) {
        int capacity=2;
        Solution solution = new Solution();
        LRUCache obj =  solution.new LRUCache(capacity);
        obj.put(1,1);
        obj.put(2,2);
        int param_1 = obj.get(1);
        System.out.println(param_1);
        obj.put(3,3);
        param_1 = obj.get(2);
        System.out.println(param_1);
        obj.put(4,4);
        param_1 = obj.get(1);
        System.out.println(param_1);
        param_1 = obj.get(3);
        System.out.println(param_1);
        param_1 = obj.get(4);
        System.out.println(param_1);
    }
/**
 * Your LRUCache object will be instantiated and called as such:
 *
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
