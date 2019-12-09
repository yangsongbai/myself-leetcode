package com.yangsongbai.seventy;

/**
 * leetCode第70题
 * 题型类别，动态规划
 *  先写出递归模式，
 *  因为递归模式，会超时间，所以改造成非递归模式，
 */

public class Solution {

    public int climbStairs(int n) {
       /* if (n < 0) return 0;
        if (n<=2)return n;
        return climbStairs(n-2)+climbStairs(n-1);*/

        if (n < 0) return 0;
        if (n<=2)return n;
        int i1 = 1;
        int i2 = 2;
        for(int i=3;i<=n;i++){
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}
