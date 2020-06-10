package com.yangsongbai.ninetyfour;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
 }

/**
 *
 */
public class Solution {

    //方法 1 递归遍历
    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        doInorderTraversal(root,list);
        return list;
    }

    public void doInorderTraversal(TreeNode root,List<Integer> list) {
       if (root==null)return;
        doInorderTraversal(root.left,list);
        list.add(root.val);
        doInorderTraversal(root.right,list);
        return ;
    }*/


}
