package com.yangsongbai.twelve;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import java.util.Arrays;

/**
 * [1,2,4]
 * [1,3,4]
 *
 * [1,1,2,3,4,4]
 */
class Solution {
    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        Solution s = new Solution();
        Solution.ListNode l1 = s.new ListNode(1);
        Solution.ListNode l11 = s.new ListNode(2);
        Solution.ListNode l12 = s.new ListNode(4);
        l1.next = l11;
        l11.next = l12;

        Solution.ListNode l2 = s.new ListNode(1);
        Solution.ListNode l21 = s.new ListNode(3);
        l2.next = l21;
        Solution.ListNode l22 = s.new ListNode(4);
        l21.next = l22;
        ListNode pre = l2;
        ListNode cur = pre;
        ListNode head = cur;
        while(l1!=null){
            if (cur==null){pre.next=l1;break;}
            if (l1.val<=cur.val){
                if (cur!=pre) pre.next = l1;
                pre=l1;
                if (head==cur)head=pre;
                l1=l1.next;
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
      //s.mergeTwoLists(l1,l2);

    }
    public ListNode mergeTwoLists(Solution.ListNode l1, Solution.ListNode l2) {
        if (l1==null)return l2;
        if (l2==null) return l1;
        ListNode pre = l2;
        ListNode cur = pre;
        ListNode head = cur;
        while(l1!=null){
            if (cur==null){pre.next=l1;break;}
            if (l1.val<=cur.val){
                ListNode node = l1;
                l1=l1.next;
                node.next=cur;
                if (cur!=pre) pre.next = node;
                pre=node;
                if (head==cur)head=node;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1==null)return l2;
        if (l2==null) return l1;
        ListNode cur,pre;
        cur=pre = l2;
        while(l1!=null){
            if (cur==null){pre.next=l1;break;}
            if (l1.val<=cur.val){
                if (cur!=pre) pre.next = l1;
                pre=l1;
                if (l2==cur)l2=pre;
                l1=l1.next;
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return l2;
    }
}