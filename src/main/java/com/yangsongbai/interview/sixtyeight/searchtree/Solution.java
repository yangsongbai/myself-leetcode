package com.yangsongbai.interview.sixtyeight.searchtree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
        if(root==null||root==p||root==q)return root;
        if ((root.val>p.val&&root.val<q.val)||(root.val<p.val&&root.val>q.val))return root;
        if (root.val>p.val&&root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        if (root.val<p.val&&root.val<q.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}