package com.yangsongbai.tentysix;
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length<=1)return nums.length;
        int pre=nums[0];
        int len=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=pre){
               pre=nums[i];
               nums[len] = nums[i];
               len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int [] arr = {1,2};
       /* System.out.println(new Solution().removeDuplicates(arr));*/
        int len = new Solution().removeDuplicates(arr);
        for (int i=0;i<len;i++){
            System.out.println(arr[i]);
        }

    }
}
