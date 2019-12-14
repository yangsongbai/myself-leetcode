package com.yangsongbai.eleven;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int h = height[left] < height[right] ?  height[left]: height[right];
        int maxArea = (right-left)*h;
        int area = 0;
        while(left<right){
            area=(right-left)*( height[left] < height[right] ?  height[left]: height[right]);
            if(area>maxArea)maxArea=area;
            if( height[left] < height[right])left++;
            else  right--;
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(arr));
    }
}
