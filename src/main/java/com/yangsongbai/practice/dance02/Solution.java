package com.yangsongbai.practice.dance02;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<=1)return "";
        String s = strs[0];
        for(int i=1;i<strs.length;i++){
            s=longestCommonPrefix(s,strs[i]);
        }
        return s;
    }

    private String longestCommonPrefix(String s, String str) {
        int len = s.length()<str.length()?s.length():str.length();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<len;i++){
            if (s.charAt(i)==str.charAt(i)){
                stringBuffer.append(s.charAt(i));
            }else
                break;
        }
        return stringBuffer.toString();
    }
}
