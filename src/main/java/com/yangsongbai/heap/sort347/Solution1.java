package com.yangsongbai.heap.sort347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * "Top" k 题型总结ing：
 *
 * "Top" k - 1: leetcode 215
 * "Top" k - 2: 面试题17.14
 * "Top" k - 3: leetcode 973
 * "Top" k - 4: leetcode 1167
 *
 * 作者：donoghl
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements/solution/java-top-k-5-by-donoghl/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int []nums = {4,1,-1,2,-1,2,3};
        solution1.print(solution1.topKFrequent(nums,2));
    }
    void print(int[] nums){
        for (int n:nums) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    class Node{
        private int key;
        private int value;
        public Node(){}
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Node []knode = new Node[k];
        int []result = new int[k];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        Node []real = new Node[hashMap.size()];
        int i=0;
        for(Map.Entry<Integer,Integer> e:hashMap.entrySet()){
            Node n = new Node(e.getKey(),e.getValue());
            if(i<k){
                knode[i]=n;
            }
            System.out.println(" key = "+e.getKey()+" value = "+e.getValue());
            real[i++] = n;
        }
        /**
         * 构建一个k个节点的小顶堆
         */
        for(int j=(k-1)/2;j>=0;j--){
            adjustHeap(knode,j,k);
        }
        for(int j=k;j<i;j++){
            System.out.println(" k = "+knode[0].value+" v = "+knode[0].value);
            if(real[j].value>knode[0].value){
                knode[0] = real[j];
                adjustHeap(knode,0,k);
            }
        }
        for (int j = knode.length - 1; j> 0; j--) {
            //将堆顶元素与末尾元素进行交换
            Node temp = knode[j];
            knode[j] = knode[0];
            knode[0] = temp;
            //重新对堆进行调整
            adjustHeap(knode, 0, j);
        }
        for (int l=0, j=k-1;j>=0;j--){
            result[l++]=knode[j].getKey();
        }
        return result;
    }

    /***
     *
     * @param knode
     * @param parent
     * @param length
     */
    private void adjustHeap(Node []knode,int parent, int length ) {
        Node temp =  knode[parent];
        int lChild =  parent*2+1;
        while(lChild<length){
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && knode[lChild].getValue() > knode[rChild].getValue()) {
                lChild++;
            }
            if(temp.getValue()<knode[lChild].getValue())break;
            knode[parent] = knode[lChild];
            parent=lChild;
            lChild= parent*2+1;
        }
        knode[parent] = temp;
    }
}
