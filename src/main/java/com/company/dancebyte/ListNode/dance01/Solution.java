package com.company.dancebyte.ListNode.dance01;


import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Solution Solution= new Solution();
        ListNode l1= new ListNode(5);
        ListNode l2= new ListNode(1);
        l2.next=new ListNode(2,new ListNode(4));
        ListNode reslut=Solution.mergeTwoLists(l1,l2);
        Solution.print(reslut);
    }

    private void print(ListNode reslut) {
        System.out.println("----------------------------------------------------");
        while(reslut!=null){
            System.out.println(reslut.val);
            reslut = reslut.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode cur1=l1;
        ListNode pre1=l1;
        ListNode cur2=l2;
        while(l2!=null&&cur1!=null){
            if(l2.val<cur1.val){
                System.out.println(l2.val);
                System.out.println(cur1.val);
                cur2=l2;
                l2=l2.next;
                cur2.next=cur1;
                if(cur1==l1){
                    l1=cur2;
                }else{
                    pre1.next=cur2;
                }
                pre1=cur2;
            }else{
                pre1=cur1;
                cur1=cur1.next;
            }
        }
        if(l2!=null)pre1.next=l2;
        return l1;
    }
}