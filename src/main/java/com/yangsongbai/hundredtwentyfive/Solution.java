package com.yangsongbai.hundredtwentyfive;

import java.util.Arrays;
import java.util.Stack;
class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("result = " + s.isPalindrome("op"));
    }
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(Character.isLetterOrDigit(a))
                stack.add(Character.toLowerCase(a));
        }
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(!Character.isLetterOrDigit(b)) continue;
            b = Character.toLowerCase(b);
            char a = stack.pop();
            if(a!=b){
                return false;
            }
        }
        return true;
    }
}