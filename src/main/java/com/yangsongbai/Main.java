package com.yangsongbai;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

   class Node {
       int val;
       Node left;
       Node right;

   }

    public void visit(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root!=null) return ;
        Node r = root;
        q.add(root);
        while(!q.isEmpty()){
            Node  n= q.element();
            System.out.println(n.val);
            if (n.left!=null)
               q.add(r.left);
            if (n.right!=null)
               q.add(n.right);
            q.poll();
        }
    }
}
