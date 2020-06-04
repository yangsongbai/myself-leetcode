package com.yangsongbai.onehundredandeighteen;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
              System.out.println(new Solution().generate(5));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> all = new ArrayList<>();
        for (int i=0;i<numRows;i++) {
            List<Integer> list = new ArrayList<>();
            for (int j=0;j<=i;j++) {
                if (j==0){list.add(1);continue;}
                if (i==j){list.add(1);continue;}
                List<Integer> befor =all.get(i-1);
                int sum=befor.get(j-1)+befor.get(j);
                list.add(sum);
            }
            all.add(list);
        }
        return all;
    }
}
