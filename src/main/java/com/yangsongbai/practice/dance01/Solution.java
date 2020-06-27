package com.yangsongbai.practice.dance01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution  solution= new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abba"));
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        Map<Character,Integer> map = new HashMap<>();
        int k=0,max=1;
        map.put(s.charAt(0),k);
        for(int i=1;i<s.length();i++){
            Integer index = map.get(s.charAt(i));
            if(index!=null){
                System.out.println("index = "+index+"  i = "+i +" s.charAt(i) = "+s.charAt(i));
                k=k>index+1?k:index+1;
            }
            map.put(s.charAt(i),i);
            max=max>(i-k+1)?max:(i-k+1);
            System.out.println("max = "+max+" k = "+k);
        }
        return max;
    }
}
