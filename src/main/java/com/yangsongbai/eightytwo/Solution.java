package com.yangsongbai.eightytwo;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  84题
 */
public class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int area = 0;
        if(len ==0)return 0;
        if (len==1) return heights[0];
        int []newHeight = new int[len+2];
        for (int i=0;i<len;i++) newHeight[i+1] = heights[i];
        Deque<Integer> stack  = new ArrayDeque<>();
        stack.add(0);
        heights = newHeight;
        for(int i=1;i<heights.length;i++){
            while(heights[stack.peekLast()]>heights[i]){
                int index = stack.pollLast();
                //如果在计算当前高度面积，在其之前有出栈的，则需要计算下他能像前扩展多远
                int wide = index - stack.peekLast()-1;
                int a = (i-index+wide)*heights[index];
                area = a>area?a:area;
            }
           stack.add(i);
        }
        return area;
    }

    public static void main(String[] args) {
        int []heights = new int[]{2,1,5,6,2,3};
        System.out.println(new Solution().largestRectangleArea(heights));
    }
}
