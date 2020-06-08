package com.yangsongbai.fortytwo2;

/**
 * 单调栈
 * https://leetcode-cn.com/problems/trapping-rain-water/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-8/
 * https://leetcode-cn.com/problems/trapping-rain-water/solution/jie-yu-shui-by-leetcode/327718/
 */
public class Solution {
    public int trap(int[] height) {
        int max_left = 0;
        int max_right= 0;
        int left = 1;
        int right = height.length-2;
        if (right<=0)return 0;
        int sum =0;
        for(int i=1;i<height.length-1;i++){
            //从左到右
              if(height[left-1]<=height[right+1]){
                  max_left = Math.max(max_left,height[left-1]);
                  int min = max_left;
                  if (min>height[left]){
                      sum +=(min - height[left]);
                  }
                  left++;
              }else{
                  max_right = Math.max(max_right,height[right+1]);
                  int min = max_right;
                  if (min>height[right]){
                      sum +=(min - height[right]);
                  }
                 right--;
              }
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {};
        int result = new com.yangsongbai.fourtytwo.Solution().trap(arr);
        System.out.println("result = " + result);
    }
}
