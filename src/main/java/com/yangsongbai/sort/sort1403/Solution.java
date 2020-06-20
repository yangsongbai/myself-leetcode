package com.yangsongbai.sort.sort1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;


public class Solution {

    public List<Integer> minSubsequence(int[] nums){
        List<Integer> result= new ArrayList<>();
        int sum=0,subsum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            subsum-=nums[i];
            result.add(nums[i]);
            if (sum<subsum)break;
        }
        return result;
    }

    /**
     * 快速排序法
     * 从大到小
     * @param nums
     */
    void quick_sort(int[] nums,int left,int right){
       if(left<right){
           int i=left,j=right,x=nums[i];
           while(i<j){
               //从右向左遍历，寻找小于等于x的值
               while(i<j&&x>nums[j]){
                   j--;
               }
               if(i<j)nums[i++]=nums[j];
               while(i<j&&x<=nums[i]){
                   i++;
               }
               if(i<j)nums[j--]=nums[i];
           }
           nums[i]=x;
           quick_sort(nums,left,i-1);
           quick_sort(nums,i+1,right);
       }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int []num = new int[]{48,6,57,73,42,60,72,73,83,88,85};
        new Solution().quick_sort(num,0,num.length-1);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        Arrays.sort(num);
       System.out.println();
    }

}
