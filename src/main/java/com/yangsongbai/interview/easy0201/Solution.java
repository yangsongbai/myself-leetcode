package com.yangsongbai.interview.easy0201;

import java.util.HashSet;
import java.util.Set;

class ListNode {
     int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head==null)return head;
        Set<Integer> set = new HashSet<>();
        ListNode cur = head.next;
        ListNode pre = head;
        set.add(cur.val);
        while(cur!=null){
            if (!set.contains(cur.val)){
                System.out.println(cur.val);
                set.add(cur.val);
                pre = cur;
            }else{
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }
}