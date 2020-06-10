#解题思路  
方法1 暴力解决法
循环遍历，以每根柱子为中心，两边进行扩展，直到找到面积最大的矩形

方法2 单调栈
基于暴力法，可以发现，当 当前柱形的高度向两边扩展时，如果找到两边的高度小于其高度，就可以停止寻找，因为这时的面积已经最大了

## 参考

https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/javade-5chong-jie-fa-xiao-lu-zui-gao-de-ji-bai-lia/  
https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/zhu-zhuang-tu-zhong-zui-da-de-ju-xing-by-leetcode-/  
