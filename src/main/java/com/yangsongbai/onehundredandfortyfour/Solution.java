package com.yangsongbai.onehundredandfortyfour;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack  = new ArrayDeque<>();
        TreeNode cur  = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                list.add(cur.val);
                stack.add(cur);
                cur= cur.left;
            }
            if(stack.isEmpty())break;
            cur = stack.pollLast();
            while(!stack.isEmpty()&&cur.right==null)cur=stack.pollLast();
            cur = cur.right;

        }
        return list;
   }

}
