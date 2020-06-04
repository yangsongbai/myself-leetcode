package com.yangsongbai.onehundredandnineteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
         System.out.println(new Solution().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        Integer []arr = new Integer[rowIndex+1];
        for (int i=0;i<=rowIndex;i++) {
            int befor = 1;
            int curr = 1;
            for (int j=0;j<=i;j++) {
                if (j==0){
                    arr[j] =1;
                    continue;
                }else if (i==j){
                    arr[j] =1;
                    continue;
                }
                else{
                    curr= arr[j];
                    arr[j] =befor+curr;
                    befor = curr;
                }

            }
        }
        return  Arrays.asList(arr);
    }

    private void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
