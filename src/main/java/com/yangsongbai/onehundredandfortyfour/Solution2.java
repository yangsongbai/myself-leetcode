package com.yangsongbai.onehundredandfortyfour;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        doPreorderTraversal(root,list);
        return list;
    }
    public void doPreorderTraversal(TreeNode root,List<Integer> list){
        if (root==null)return;
        list.add(root.val);
        doPreorderTraversal(root.left,list);
        doPreorderTraversal(root.right,list);
    }
}
