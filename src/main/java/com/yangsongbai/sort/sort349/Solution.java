package com.yangsongbai.sort.sort349;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }
        int k=0;
        for(int i=0;i<nums2.length;i++){
            Integer r = map.get(nums2[i]);
            if (r==null||r==0) {
                continue;
            }
            if(map.get(nums2[i])==1) k++;
            map.put(nums2[i],map.get(nums2[i])+1);
        }
        int []result = new int[k];

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e==null)continue;
            if(e.getValue()>1){
                System.out.println(e.getKey()+" = "+e.getValue()+";");
                result[--k]=e.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []num1 = new int[]{48,6,57,73,483,88,85};
        int []num2 = new int[]{48,6,57,73,42,60,72,73,83,88,85};
        int []num=new Solution().intersection(num1,num2);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
