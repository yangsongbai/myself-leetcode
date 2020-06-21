package com.yangsongbai.sort.sort349;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        BubbleSort(nums1);
        BubbleSort(nums2);
        int k=0;
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                if (k==0||nums1[k-1]!=nums1[i])
                    nums1[k++]=nums1[i];
                i++;j++;
                continue;
            }
            if(nums1[i]<nums2[j]){i++;continue;}
            if(nums1[i]>nums2[j])j++;
        }
        int []result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=nums1[i];
        }
        return result;
    }

    /**
     * 冒泡排序从小到大
     * @param nums
     */
    public void BubbleSort(int[] nums){
         for(int i=nums.length-1;i>0;i--){
             for(int j=0;j<i;j++){
                  if(nums[j]>nums[j+1]){
                      int temp = nums[j+1];
                      nums[j+1]=nums[j];
                      nums[j] = temp;
                  }
             }
         }
    }
    public static void main(String[] args) {
        int []num1 = new int[]{48,6,57,73,483,88,85};
        int []num2 = new int[]{48,6,57,73,42,60,72,73,83,88,85};
        int []num=new Solution1().intersection(num1,num2);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
