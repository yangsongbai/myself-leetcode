package com.yangsongbai.interview.fiftyfive;

class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root==null)return true;
        if (Math.abs(deep(root.right)-deep(root.left))>1)return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    int deep(TreeNode root){
        if (root==null)return 0;
        int right = deep(root.right);
        int left = deep(root.left);
        return Math.max(right,left)+1;
    }
}
