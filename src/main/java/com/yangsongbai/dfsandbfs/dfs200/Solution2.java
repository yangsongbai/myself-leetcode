package com.yangsongbai.dfsandbfs.dfs200;

/**
 * // 用一个 M×N 的矩阵表示一个未知星球的地表，0 表示该区域为海洋，1 表示该区域为陆地，每块陆地只可能与上、下、左、右相邻的四块陆地接壤，请找到这个星球上面积最大的岛屿面积。
 * // 示例：
 * // 输入：
 * // [
 * // [1, 1, 0],
 * // [1, 0, 0],
 * // [0, 0, 1]
 * // ]
 * // 输出：3
 */
public class Solution2 {
    int r = 0;
    int c = 0;

    public int MaxNumIslands(char[][] grid) {
        int result = 0;
        int max = 0;
        if (grid.length == 0 || grid[0].length == 0) return result;
        r = grid.length;
        c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    result = dfs(grid, i, j);
                    System.out.println("result = "+result);
                    max = max > result ? max : result;
                }
            }
        }
        return max;
    }

    /**
     * @param grid
     * @param r
     * @param c
     * @return
     */
    private int dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return 0;
        if (grid[r][c] == '0') return 0;
        grid[r][c] = '0';
        return dfs(grid, r - 1, c) + dfs(grid, r + 1, c) + dfs(grid, r, c - 1) + dfs(grid, r, c + 1) + 1;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        char[][] grid = new char[][]{
                {'1', '1', '1', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '1'}};
        System.out.println(solution.MaxNumIslands(grid));
    }
}
