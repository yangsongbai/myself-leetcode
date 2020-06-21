package com.yangsongbai.sort.sort922;

import com.yangsongbai.sort.sort1403.Solution;

import java.util.Arrays;

public class Solution1 {

    public int[] sortArrayByParityII(int[] A) {
        int []odd = new int[A.length];
        int []even = new int[A.length];
        insertSort(A);
        int o=0,e=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                even[e++]=A[i];
            }else{
                odd[o++] = A[i];
            }
        }
        o=0;e=0;
        for(int i=0;i<A.length;i++){
            if(i%2==0){
                A[i]=even[e++];
            }
            else{
                A[i]=odd[o++];
            }
        }
        return A;
    }

    /**
     * 简单插入排序
     * @param A
     */
    void insertSort(int[] A){
        for(int i=0;i<A.length;i++){
            //寻找插入的位置
            int temp = A[i];
            int j=0;
            for(;j<i;){
                if(A[j]>A[i])break;
                j+=1;
            }
           if(i==j)continue;
           //往后挪出一个位置
            for(int k=i-1;j<=k;k--){
                A[k+1]=A[k];
            }
            A[j] = temp;
        }
    }

    public static void main(String[] args) {
        int []num = new int[]{48,6,57,73,483,88,85};
        new Solution1().insertSort(num);


    }
}
