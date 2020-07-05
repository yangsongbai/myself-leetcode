package com.company.dancebyte.struct.dance03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    class AllOne {
    Map<String,Integer> map;
        class Node {
            Node pre;
            Node next;
            int value;
            String key;
            HashSet<Node> set;
            public Node(String key, int value) {
                this(key, value, null, null);
            }

            public Node(String key, int value, Node pre,Node next) {
                this.key = key;
                this.value = value;
                this.pre = pre;
                this.next = next;
                set = new HashSet<>();
            }
        }

        Node head;
        Node tail;
    /** Initialize your data structure here. */
    public AllOne() {
        map = new HashMap<>();
        head = new Node("", -1);
        tail = new Node("", -2);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        Integer count = map.get(key);
        if(count==null){
            count = 0;
        }
        map.put(key,count+1);
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        Integer count = map.get(key);
        if(count==null){
            count = 0;
            return ;
        }
        if(count==1)map.remove(key);
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {

        return "";
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {

        return "";
    }
    }
}
