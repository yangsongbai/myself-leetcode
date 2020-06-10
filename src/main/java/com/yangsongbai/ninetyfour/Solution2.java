package com.yangsongbai.ninetyfour;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 解法 2
 */
public class Solution2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode cur = root;
        while (cur!=null||!stack.isEmpty()){
            while (cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pollLast();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

}
