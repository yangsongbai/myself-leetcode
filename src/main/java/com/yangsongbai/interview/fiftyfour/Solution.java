package com.yangsongbai.interview.fiftyfour;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Solution {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        visit(root,list);
        return list.get(k-1);
    }
    void visit(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        visit(root.right,list);
        list.add(root.val);
        visit(root.left,list);
    }
}
