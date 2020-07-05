package com.yangsongbai.linekedlist.list83;



class ListNode {
    int val;
    ListNode next;
   ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode result = new ListNode(-1);
        System.out.println(result.val);
        ListNode cur=result;
        cur.next=head;
        cur=cur.next;
        head=head.next;
        cur.next=null;
        System.out.println(result.val);
        System.out.println(result.next.val);
        while(head!=null){
            if(cur.val!=head.val){
                cur.next=head;
                cur=cur.next;
                head=head.next;
                cur.next=null;
            }else{
                head=head.next;
            }

        }
        return result.next;
    }

    public static void main(String[] args) {
        Solution solution= new Solution();
        ListNode head = new ListNode(1);
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(2);
        head.next=head2;
        solution.deleteDuplicates(head);
        printNode(head);
    }

    private static void printNode(ListNode head) {
        while(head!=null){
            System.out.println(head.val);
            head=head.next;

        }
    }
}