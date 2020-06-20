package com.yangsongbai.sort1370;

import java.nio.Buffer;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class Solution {
    public String sortString(String s) {
        char[] array= s.toCharArray();
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        for (int i=0;i<array.length;i++){
           Integer re =  treeMap.get(array[i]);
           if (re==null)re=0;
           treeMap.put(array[i],re+1);
        }
        int i=1;
        StringBuffer all = new StringBuffer();
        while(!isEmpty(treeMap)){
            StringBuffer sub = new StringBuffer();
            for (Map.Entry<Character, Integer> result:treeMap.entrySet()){
                if (result.getValue()==0)continue;
                char ch = result.getKey();
                treeMap.put(ch,result.getValue()-1);
                sub.append(ch);
            }
            if (i%2==1) all.append(sub);
            else{
                all.append(sub.reverse());
            }
            i++;
        }
        return all.toString();
    }

    private boolean isEmpty(TreeMap<Character, Integer> treeMap) {
        for (Map.Entry<Character, Integer> result:treeMap.entrySet()){
            if (result.getValue()!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().sortString("aaassaaaddvvva"));
    }
}
