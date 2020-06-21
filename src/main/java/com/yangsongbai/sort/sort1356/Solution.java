package com.yangsongbai.sort.sort1356;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, TreeMap<Integer,Integer>> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            int key = bitCount(arr[i]);
            TreeMap<Integer,Integer> set = map.get(key);
            if (set == null){
                set = new  TreeMap<Integer,Integer>();
            }
            Integer count = set.get(arr[i]);
            set.put(arr[i],count+1);
            map.put(key,set);
        }
        int i=0;
        for(Map.Entry<Integer,TreeMap<Integer,Integer>> e:map.entrySet()){
            TreeMap<Integer,Integer> set = e.getValue();
            if (set == null){
                continue;
            }
            for (Map.Entry<Integer,Integer> s:set.entrySet()){
                int key=s.getKey();
                int value = s.getValue();
                for(int j=0;j<value;j++){
                    arr[i++]=key;
                }
            }
        }
        return arr;
    }

    int bitCount(int n){
        int count=0;
        for(;n>0;n>>=1){
            count+=n&1;
        }
        return count;
    }
}
