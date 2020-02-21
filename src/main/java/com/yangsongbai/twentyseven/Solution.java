package com.yangsongbai.twentyseven;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        Solution s =new Solution();
     /*   int []nums = new int[]{0,1,2,2,3,0,4,2};*/
        int []nums = new int[]{3,2,2,3};
        int n = s.removeElement(nums,3);
        System.out.println("n = " + n);
        for (int i=0;i<n;i++){
            System.out.println("nums = " + nums[i]);
        }
    }
    public int removeElement(int[] nums, int val) {
     /*   int cur;
        for (int i=1;i<nums.length;i++){
            cur = nums[i];
            int j =i-1;
            for (;j>0;j--){
                if (nums[i]>nums[j]) break;
            }
           for(int k=i-1;k>j;k--) nums[k+1]=nums[k];
           nums[j]=cur;
        }*/
        int k=0;
        for (int i=0;i<nums.length;i++){
             if (val==nums[i])k++;
             else{
                 nums[i-k]=nums[i];
             }
        }
        return nums.length-k;
    }
}
