package com.yangsongbai.dfsandbfs.dfs200;

public class Solution {
    int r=0;
    int c=0;
    public int numIslands(char[][] grid) {
        int result =0;
        if(grid.length==0||grid[0].length==0)return result;
        r = grid.length;
        c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    result++;
                }
            }
        }
        return result;
    }

    /**
     *
     * @param grid
     * @param r
     * @param c
     * @return
     */
    private void dfs(char[][] grid,int r,int c){
        if(r<=0||c<=0||r>=grid.length||c>=grid[0].length) return;
        if (grid[r][c]=='0')return;
        grid[r][c]='0';
        System.out.println(" r = "+r+" ; c = "+c);
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        return ;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        System.out.println(solution.numIslands(grid));
    }
}
