package com.yangsongbai.onehundredandfortyone;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


 class ListNode {
    int val;
   ListNode next;
    ListNode(int x) {
    val = x;
       next = null;
    }
  }
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null)return false;
        ListNode slow = head;
        ListNode fast = head.next;
        if (fast==null)return false;
        fast = fast.next;
        while (fast!=null){
            if (slow.val==fast.val)return true;
            slow = slow.next;
            fast = fast.next;
            if (fast==null)return false;
            fast = fast.next;
        }
        return  false;
    }

}
