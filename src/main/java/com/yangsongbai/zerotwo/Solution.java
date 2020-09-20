package com.yangsongbai.zerotwo;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        while(l1!=null){
            queue1.add(l1.val);
            l1 =l1.next;
        }
        while(l2!=null){
            queue2.add(l2.val);
            l2 =l2.next;
        }
        ListNode head = new ListNode(-1);
        ListNode p = head;
        int sum=0;
        int carry = 0;
        while(!queue1.isEmpty()&&!queue2.isEmpty()){
            sum=queue1.poll()+queue2.poll()+carry;
            p.next = new ListNode(sum%10);
            p = p.next;
            carry=sum/10;
        }
        while(!queue1.isEmpty()){
            sum=queue1.poll()+carry;
            p.next = new ListNode(sum%10);
            p = p.next;
            carry=sum/10;
        }
        while(!queue2.isEmpty()){
            sum=queue2.poll()+carry;
            p.next = new ListNode(sum%10);
            p = p.next;
            carry=sum/10;
        }
        if(carry!=0){
            p.next = new ListNode(carry);
        }
        return head.next;
    }
}
