package com.yangsongbai.dp.dp5;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("cbbd"));
    }
    public String longestPalindrome(String s) {

        if(s.isEmpty()){return s;}
        int n=s.length();
        if(n<2)return s;
        int maxLen = 1;
        int start=0;
        boolean [][]isPalindrome = new boolean[n][n];
        for(int i=0;i<n;i++){isPalindrome[i][i]=true;}
        for(int j=1;j<n;j++){
            for(int i=0;j>i;i++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<3)
                    isPalindrome[i][j]=true;
                    else{
                        isPalindrome[i][j]= isPalindrome[i+1][j-1];
                    }
                }
                if(isPalindrome[i][j]&&j-i+1>maxLen){
                    maxLen = j-i+1;
                    start = i;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}
