package com.yangsongbai.seventyone2;


import java.util.*;

/**
 *
 */
public class Solution {

    public String simplifyPath(String path) {
        path = path.trim();
       /* if (path.endsWith("/"))path=path.substring(0,path.length()-1);
        if (path.startsWith("/"))path=path.substring(1,path.length());
        System.out.println("------------ path = "+path);*/
        String []paths = path.split("/");
        List <String>  pTrim = new LinkedList<String>();
        for(int i=0;i<paths.length;i++){
              String p = paths[i].trim();
            if (!"".equals(p)&&!" ".equals(p)){
                pTrim.add(p);
            }
        }
        Deque<String> stack = new LinkedList<String>();
        for(String str:pTrim){
            if ("".equals(str)||".".equals(str))continue;
            if ("..".equals(str)||".."==str){
                if (stack.isEmpty())continue;
                stack.pop();
            }else{
                stack.push("/"+str);
            }
        }
        StringBuffer result = new StringBuffer();
        while (!stack.isEmpty()){
           String r= stack.pollLast();
            result.append(r);
        }
        if (result.toString().trim().isEmpty())return "/";
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().simplifyPath("/a//b////c/d//././/.."));
    }
}
