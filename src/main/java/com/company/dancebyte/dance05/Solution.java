package com.company.dancebyte.dance05;

public class Solution {
    public String reverseWords(String s) {
        s= s.trim() ;
        String []ss=s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=ss.length-1;i>=0;i--){
            String v= ss[i].trim();
            if(!"".equals(v)){
                sb.append(" "+v);
            }
        }
        return sb.toString().trim();
    }

}
