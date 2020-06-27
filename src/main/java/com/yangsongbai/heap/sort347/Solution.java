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
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []result = new int[k];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a,b)->{return b.getValue()-a.getValue();});
        for(Map.Entry<Integer,Integer> e:hashMap.entrySet()){
            maxheap.offer(e);
        }
        for(int i=0;i<k;i++){
            result[i]=maxheap.poll().getKey();
        }
        return result;
    }

    private void buildMinHeap(int[] result) {
    }
}
