package com.yangsongbai.twentyeight;

import java.util.Arrays;
import java.util.Stack;

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int i = s.strStr("aaa","aaaa");
        System.out.println("i = " +i);
    }
    public int strStr(String haystack, String needle) {
        Stack<Character> s = new Stack<Character>();

        if (needle.isEmpty())return 0;
        boolean flag=true;
        for (int i=0;i<haystack.length();i++){
            flag=true;
            for ( int j=0;j<needle.length()&&flag;j++){
                 if (i+j>=haystack.length()||haystack.charAt(i+j)!=needle.charAt(j)){flag=false;}

            }
           if (flag)return i;
        }
        return -1;
    }
}


/**
 void kmp_init(const char *s, int *prefix, size_t size) {
 prefix[0] = 0;
 for (size_t i = 1; i < size; ++i) {
 if (s[i] == s[prefix[i - 1]])
 prefix[i] = prefix[i - 1] + 1;
 else {
 int j = i - 1;
 while (prefix[j] > 0 && s[prefix[j]] != s[i])
 j = prefix[j] - 1;
 if (prefix[j] > 0)
 prefix[i] = prefix[j] + 1;
 else {
 prefix[i] = (s[i] == s[0]);
 }
 }
 }
 }

 int strStr(const char *src, const char *dest) {
 if (!dest || !src)
 return -1;
 if (!*dest)
 return 0;
 size_t size = strlen(dest);
 int *prefix = malloc(sizeof(int) * size);
 kmp_init(dest, prefix, size);
 size_t i, j;
 for (i = j = 0; src[i] && j < size; ++i) {
 if (dest[j] == src[i]) {
 ++j;
 }
 else if (j) {
 while (prefix[j - 1] > 0 && dest[prefix[j - 1]] != src[i])
 j = prefix[j - 1];
 if (prefix[j - 1] > 0) {
 j = prefix[j - 1] + 1;
 }
 else {
 j = (dest[0] == src[i]);
 }
 }
 }
 free(prefix);
 if (j < size)
 return -1;
 return i - size;
 }
 */