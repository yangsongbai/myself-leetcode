package com.yangsongbai.sort.sort1122;

import java.util.*;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int []arr = new int[arr1.length];
        selectSort(arr1);
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> relative = new ArrayList<>();
        //记录arr2出现的元素
        for(int i=0;i<arr2.length;i++){
            Integer v= map.get(arr2[i]);
            if(v!=null&&v==-1)continue;
            map.put(arr2[i],-1);
            relative.add(arr2[i]);
        }
        //记录这些元素出现的个数
        for(int i=0;i<arr1.length;i++){
            Integer value = map.get(arr1[i]);
            if (value==null||value==0)continue;
            if(value==-1) map.put(arr1[i],1);
            else map.put(arr1[i],value+1);
        }
        int index=0;
        for(int i=0;i<relative.size();i++){
            Integer value = map.get(arr2[i]);
            for(int k=0;k<value;k++){
                arr[index++]=relative.get(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            Integer value = map.get(arr1[i]);
            if (value!=null)continue;
            arr[index++] = arr1[i];
        }
        return arr;
    }

    /***
     * 选择排序
     * @param sort
     */
    void selectSort(int []sort){
        for(int i=0;i<sort.length;i++){
            int min = sort[i];
            int k=i;
            for(int j=i;j<sort.length;j++){
                if(sort[j]<sort[k]) k = j;
            }
            if(k!=i&&k<sort.length){
                sort[i]=sort[k];
                sort[k] = min;
            }
        }
    }
    void quick_sort(int[] nums,int left,int right){
        if(left<right){
            int i=left,j=right,x=nums[i];
            while(i<j){
                //从右向左遍历，寻找小于等于x的值
                while(i<j&&x<nums[j]){
                    j--;
                }
                if(i<j)nums[i++]=nums[j];
                while(i<j&&x>=nums[i]){
                    i++;
                }
                if(i<j)nums[j--]=nums[i];
            }
            nums[i]=x;
            quick_sort(nums,left,i-1);
            quick_sort(nums,i+1,right);
        }
    }

    public static void main(String[] args) {
        int []arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int []arr2 = new int[]{2,1,4,3,9,6};
        int []arr=new Solution().relativeSortArray(arr1,arr2);
        new Solution().print(arr);
    }

    void print(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
