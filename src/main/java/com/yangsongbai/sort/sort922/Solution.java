package com.yangsongbai.sort.sort922;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int []odd = new int[A.length];
        int []even = new int[A.length];
        Arrays.sort(A);
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
}
