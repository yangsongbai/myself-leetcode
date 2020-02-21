package com.yangsongbai.fourtytwo;

import java.util.Arrays;

public class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right= height.length;
        while (left<right){
            if (height[left++]!=0)break;
        }
        while (right>0){
            if (height[--right]!=0)break;
        }

        int top = left-1;
        int pre = top;
        int area=0;
        if (left>=right)return 0;
        while (left<right){
            if (height[left]!=0&&pre+1!=left){
                area += (left-pre) *(height[left]<height[pre]?height[left]:height[pre]);
                if (height[left]>height[top]){
                    pre=left;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int []arr = {};
        int result = new Solution().trap(arr);
        System.out.println("result = " + result);
    }
}
