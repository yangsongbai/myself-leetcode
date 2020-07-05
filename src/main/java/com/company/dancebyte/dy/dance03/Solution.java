package com.company.dancebyte.dy.dance03;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        int k=0;
        int len=0;
        int min=0;
        for(int i=0;i<triangle.size();i++){
            len=k+1;
            k=k-1;
            if(k<0)k=0;
            if(len>=triangle.get(i).size())len=triangle.get(i).size()-1;
            min=triangle.get(i).get(k);
            for(int j=k;j<=len;j++){
                int tmp = triangle.get(i).get(j);
                if(min>tmp){
                    k=j;
                    min=tmp;
                }
            }
            System.out.println(min);
                    sum+=min;
        }
        return sum;
    }
}