package com.yangsongbai.seven;

public class Solution {
    public int reverse(int x) {
        int rs = 0;
        int y=x;
        Math.sqrt(x);
        for(;x!=0;rs=rs*10+x%10,x/=10);
        return (int)(rs>Integer.MAX_VALUE||rs<Integer.MIN_VALUE?0:rs);
    }

    public static void main(String[] args) {
          new Solution().reverse(121);
    }
}
